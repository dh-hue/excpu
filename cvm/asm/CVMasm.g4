grammar CVMasm;

fragment LETTER: [a-z]|[A-Z]|;
fragment HEXDIGIT: [0-9]|[a-f]|[A-F];

MOVE: 'mov';
MOVEL: 'movl';
INT: '0x' HEXDIGIT+;
OFF: '#'INT;

ADD: 'add';
SUB: 'sub';
MUL: 'mul';
DIV: 'div';
COPY: 'cpy';
COPYL: 'cpyl';
OUT: 'out';
OUTL: 'outl';
SET: 'set';
SETL: 'setl';
HALT: 'hlt';
BEGIN: 'begin';
END: 'end';
EOS: ';';

STRING: '"' .*? '"';
CHARACTER: '\'' . '\'';

add_cmd: ADD INT INT OFF EOS;
sub_cmd: SUB INT INT OFF EOS;
mul_cmd: MUL INT INT OFF EOS;
div_cmd: DIV INT INT OFF EOS;

addv_cmd: ADD OFF OFF EOS;
subv_cmd: SUB OFF OFF EOS;
mulv_cmd: MUL OFF OFF EOS;
divv_cmd: DIV OFF OFF EOS;

set_cmd: SET OFF INT EOS;
setl_cmd: SETL OFF INT+ EOS;
otype: INT | CHARACTER;

out_cmd: OUT OFF otype INT EOS;
outl_cmd: OUT OFF (otype+|STRING) INT EOS;

mov_cmd: MOVE OFF OFF EOS;
movl_cmd: MOVEL OFF OFF INT EOS;

cpy_cmd: COPY OFF OFF EOS;
cpyl_cmd: COPYL OFF OFF INT EOS;

halt_cmd: HALT EOS;

cmd: add_cmd
    | sub_cmd
    | mul_cmd
    | div_cmd
    | addv_cmd
    | subv_cmd
    | mulv_cmd
    | divv_cmd
    | set_cmd
    | setl_cmd
    | halt_cmd
    | out_cmd
    | outl_cmd
    | cpy_cmd
    | cpyl_cmd
    | mov_cmd
    | movl_cmd
    ;
cmdlist: cmd+;

program: cmdlist;

WS: [ \r\n\t] -> skip;