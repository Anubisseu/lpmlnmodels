/**
* LPMLN 词法语法定义
* 王彬
* 2016-08-30
**/
grammar LPMLN;

/**
* 词法定义
**/

//缺省否定关键字
NAF_NOT : 'not ';
//字符串
STRING : '"' ('\\"'|~('"'))* '"';
//规则终结符
FULLSTOP : '.';
//正整数
POSITIVE_INT : [1-9][0-9]*;
//小数(点表示法)
DECIMAL : MINUS? (POSITIVE_INT* | ZERO ) FULLSTOP [0-9] [0-9]? [0-9]? [0-9]? [0-9]?;

//0
ZERO : '0';
//identifier
IDENTIFIER : [_]*[a-z][a-zA-Z0-9_']*;
//常量
constant : IDENTIFIER | BOOL_CONSTANTS;
//变量
VAR : [_]*[A-Z][a-zA-Z0-9_']*;

//指数运算
EXPONENITIATION : '**';
//位运算
BITWISE_AND : '&';
BITWISE_OR : '?';
BITWISE_EXCLUSIVE_OR : '^';
BITWISE_COMPLEMENT : '~';
//加号
PLUS : '+';
//减号、经典否定关键字
MINUS : '-';
//乘号、 星号
STAR : '*';
//除号、斜线
SLASH : '/';
//取摸
BACKSLASH : '\\';

//左圆括号
LPAREN : '(';
//右圆括号
RPAREN : ')';
//左方括号
LSBRACK : '[';
//右方括号
RSBRACK : ']';
//左花括号
LCBRACK : '{';
//右花括号
RCBRACK : '}';
//范围运算
RANGE : '..';

//逗号
COMMA : ',';
//认知析取符
DISJUNCTION : '|';
//条件限制符
CONDITION : ':';
//推导符号
ASSIGN : ':-';
//弱约束推导符号
WEAK_ASSIGN : ':~';
//分号
SEMICOLON : ';';

//关系运算符
LESS_THAN : '<';
LEQ : '<=';
GREATER_THAN : '>';
GEQ : '>=';
EQUAL : '=';
DOUBLE_EQUAL : '==';
NEQ : '!=';

AGGREGATE_OP : '#count' | '#sum' | '#max' | '#min';
//
META_OP : '#show ';
//单行注释
LINE_COMMENT : ('%' ~('\r' | '\n')* '\r'? '\n') -> skip;
//空白字符或换行符
WS : ( ' ' | '\t' | '\n' | '\r')+ -> skip  ;

//布尔常量
BOOL_CONSTANTS : '#true' | '#false';

//外部函数
AT : '@';

/**
* 语法规则定义
**/
//负整数
negative_int :   MINUS POSITIVE_INT ;
//整数
integer : POSITIVE_INT | negative_int | ZERO;
//自然数
natural_number : POSITIVE_INT | ZERO;
//四则运算符
arithmetic_op : PLUS | MINUS | STAR | SLASH | BACKSLASH;
//二元位运算
bitwise_op : BITWISE_AND | BITWISE_OR | BITWISE_EXCLUSIVE_OR;
//二元运算符
binary_op : arithmetic_op | bitwise_op | EXPONENITIATION | RANGE;
//一元运算符
unary_op : BITWISE_COMPLEMENT;
//数字
bit_number : unary_op? integer;
//关系运算符(comparison predicates)
relation_op : LESS_THAN | LEQ | GREATER_THAN | GEQ | EQUAL | NEQ;

//简单四则运算算术表达式，不加括号
simple_arithmetic_expr :
    integer |
    (MINUS)? VAR |
    (integer | (MINUS)? VAR) (binary_op (integer | VAR))* |
    unary_op simple_arithmetic_expr |
    DISJUNCTION simple_arithmetic_expr DISJUNCTION;

//四则运算算术表达式，加括号
simple_arithmetic_expr2 :
     simple_arithmetic_expr |
    (LPAREN simple_arithmetic_expr2  RPAREN) |
     simple_arithmetic_expr2 arithmetic_op simple_arithmetic_expr2;

//四则运算表达式
arithmethic_expr:
    simple_arithmetic_expr2 |
    MINUS LPAREN simple_arithmetic_expr2 RPAREN;


//函数
function : AT? IDENTIFIER LPAREN term RPAREN;
//简单项，缺_,#sup,#inf
simpleterm : integer | constant | STRING | VAR;
//元组
tuple : | COMMA | ( COMMA term )+ ;

//范围枚举
//interval : (integer | VAR) RANGE (integer | VAR);
//逐个枚举
pooling :  (SEMICOLON term)+;

//项
//term : VAR | CONSTANT | integer | arithmethic_expr | function | STRING;
term : (simpleterm | function | arithmethic_expr | LPAREN term RPAREN) (tuple | pooling);

//原子
atom :
    constant |
    IDENTIFIER LPAREN term (COMMA term)* RPAREN;

//文字
literal : atom | MINUS atom | comparison_literal;

//缺省文字
//default_literal : NAF_NOT literal;

//扩展文字，包含查询原子
//extended_literal : literal | default_literal;

//项元组
term_tuple : term (COMMA term)*;

//文字元组
literal_tuple : NAF_NOT? literal (NAF_NOT? COMMA literal)*;

//聚合元素
aggregate_elements : (term_tuple CONDITION)? literal_tuple (SEMICOLON (term_tuple CONDITION)? literal_tuple)*;

//带条件的聚合元素
aggregate_elements_condition : (term_tuple CONDITION)? literal_tuple CONDITION literal_tuple (SEMICOLON (term_tuple CONDITION)? literal_tuple CONDITION literal_tuple)*;

//体部聚合原子
body_aggregate : (term relation_op?)? AGGREGATE_OP? LCBRACK aggregate_elements RCBRACK (relation_op? term)?;
//aggregate_atom : AGGREGATE_OP LCBRACK (literal | VAR) CONDITION literal  RCBRACK ;

//头部聚合原子
head_aggregate : (term relation_op?)? AGGREGATE_OP? LCBRACK aggregate_elements_condition RCBRACK (relation_op? term)?;

//聚合运算表达式
//aggregate_expr: (VAR | aggregate_atom | integer) relation_op aggregate_atom |
//                aggregate_atom relation_op (VAR | integer) |
//                VAR EQUAL aggregate_atom;

//关系运算表达式
//relation_expr : ((MINUS)? term) relation_op ((MINUS)? term);
comparison_literal : ((MINUS)? term) relation_op ((MINUS)? term);


//规则头部
head : (head_literal DISJUNCTION)* head_literal;

//头部文字
head_literal : NAF_NOT? (literal | head_aggregate | condition_literal);

//条件文字
condition_literal : literal CONDITION literal (COMMA literal)*;


//规则体部
body : (body_literal COMMA | condition_literal SEMICOLON)* (body_literal | condition_literal) ;

//体部文字
body_literal : NAF_NOT? NAF_NOT? (literal | body_aggregate);

//事实
fact : head FULLSTOP;

//约束
constraint : ASSIGN body FULLSTOP;

//基本规则
full_rule : head ASSIGN body FULLSTOP;

//ASP 规则 （hard rule）
hard_rule :  fact | constraint | full_rule;

//弱规则 (soft rule)
soft_rule : (DECIMAL | integer ) CONDITION hard_rule;

//
meta_rule : META_OP (MINUS)? IDENTIFIER SLASH natural_number FULLSTOP;

//ASP4QA程序
lpmln_rule : (hard_rule | soft_rule | meta_rule)*;