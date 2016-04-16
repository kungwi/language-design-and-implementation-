/* Brainfuck grammar by Christophoros Mouratidis */

grammar Brainfuck;

start : prog ;

prog : (loop | com)*;

loop : LoopOpen prog LoopClose  #handleLoop 
	;

com : Read              # readByte
    | Write             # writeByte
    | Increment         # increment
    | Decrement         # decrement
    | PointerRight      # moveRight
    | PointerLeft       # moveLeft
    ;

Read          :',';
Write         :'.';
Increment     :'+';
Decrement     :'-';
PointerRight  :'>';
PointerLeft   :'<';

LoopOpen   : '[';
LoopClose  : ']';

WhiteSpace : [ \n\t\r]+ -> skip;