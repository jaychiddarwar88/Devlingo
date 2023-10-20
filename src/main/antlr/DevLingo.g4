grammar DevLingo;


program
	: 'main()' statement
	;


statement
	: '{' block+ '}'
	;


block
	: (ifBlock|whileLoop|rangedForLoop|forLoop|printStatement|assignmentExpression)
	;


assignmentExpression
	: 'int' IDEN (EQUALS mathematicalExpression)?              # intAssignment
	| 'int' IDEN EQUALS ternaryExpression             # intAssignment
	| 'boolean' IDEN (EQUALS logicalExpression)?         # boolAssignment
	| 'boolean' IDEN (EQUALS ternaryExpression)?      # boolAssignment
	| 'string' IDEN (EQUALS STRING)?       # stringAssignment
	| 'string' IDEN (EQUALS ternaryExpression)?       # stringAssignment
	| IDEN EQUALS mathematicalExpression                       # intAssignment
	| IDEN EQUALS logicalExpression                      # boolAssignment
    ;


expression
    : mathematicalExpression
    | logicalExpression
    ;


logicalExpression
    : logicalExpression op=(AND|OR|IS_EQUAL_TO|NOT_EQUAL_TO) logicalExpression  # boolLogExpression
    | comparisonExpression                                               # boolCompExpression
    | '(' logicalExpression ')'                                       # boolExpressionInBrackets
    | BOOLEAN										          # primitiveBoolValuesOnly
    | IDEN										      # boolIDENOnlyExpression
    ;


comparisonExpression
    : mathematicalExpression op=(GREATER_THAN|LESS_THAN|GREATER_THAN_OR_EQUAL|LESS_THAN_OR_EQUAL|IS_EQUAL_TO|NOT_EQUAL_TO) mathematicalExpression  # numbCompExpression
    ;


mathematicalExpression
    : mathematicalExpression op=(MULTIPLY|DIVISION) mathematicalExpression                    # numberMultDivExpression
    | mathematicalExpression op=(ADDITIONAL|SUBTRACT) mathematicalExpression                    # numberADDITIONALSUBTRACTExpression
    | '(' mathematicalExpression ')'                                  # numbBrackExpression
    | SUBTRACT? DIGITS                                       # numberOnly
    | SUBTRACT? IDEN                                   # numberIDENOnly
    ;


conditionalExpression
    : '(' logicalExpression ')'
    ;


ifBlock
    : 'if' conditionalExpression statement (else_ifBlock)* (else_expr)?
    ;


else_ifBlock
    : 'else if' conditionalExpression statement
    ;


else_expr
    : 'else' statement
    ;


whileLoop
    : 'while' conditionalExpression statement
    ;


rangedForLoop
    : 'for' IDEN 'in' 'range' '(' rangeVal ';' rangeVal ')' statement
    ;

rangeVal
	: IDEN
	| DIGITS
	;

forLoop
    : 'for' '(' assignmentExpression ';' logicalExpression ';' variable_change_part ')' statement
    ;

variable_change_part : increment_expression
                        | decrement_expression
                        ;

decrement_expression : IDEN '--'
                       | '--' IDEN;


increment_expression : IDEN '++'
                       | '++' IDEN;


ternaryExpression
    : conditionalExpression '?' expression ':' expression
    | conditionalExpression '?' BOOLEAN ':' BOOLEAN
    | conditionalExpression '?' STRING ':' STRING
    ;


printStatement
    : 'printf' '(' (DIGITS|BOOLEAN|IDEN|mathematicalExpression|logicalExpression|STRING) ')'
    | 'printf' '(' STRING ',' (IDEN|BOOLEAN|STRING|DIGITS) ')'
    ;


DIGITS
	: [1-9] [0-9]*
	| '0'
	;


BOOLEAN
	: 'true'
	| 'false'
	;


ADDITIONAL               : '+';
SUBTRACT               : '-';
MULTIPLY               : '*';
DIVISION              : '/';
AND               : 'and';
OR                : 'or';
LESS_THAN         : '<';
GREATER_THAN      : '>';
LESS_THAN_OR_EQUAL : '<=';
GREATER_THAN_OR_EQUAL : '>=';
NOT_EQUAL_TO       : 'not';
IS_EQUAL_TO        : '==';


IDEN
	: [a-zA-Z_] [a-zA-Z_0-9]*
	;


STRING
    : '"' [a-zA-Z0-9_]* '"'
    ;


EQUALS   : '=';


WHITE_SPACES    : [ \t\r\n]+ -> skip;
