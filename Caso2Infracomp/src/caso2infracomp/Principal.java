/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2infracomp;

import java.io.*;
import java.net.*;
import servidor.Servidor;

/**
 *
 * @author j.montes495
 */
public class Principal{
    
    /*

    -------------------- Mi trabajo aqui esta hecho -----------------------
    --------------------------------------------------- Johnathan Nimoy----
"//"/////"/"/"/-""/"/""""/?OS@@@@@@@@@@@@@@@@@@@#$O=/-;'-;;;;;;;-;"/+===+//""""
;-;;-;---;-;;;-;---"-""??O8@@@@@@@@@@@@@@@@@@@@@@@8I"-;:;':'''''';-/+==?/""-"--
'''''''''''''''.;-/*O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@8X";'::::::'';"/???/"--;--;
''::''''''':':':;/I@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O=-;::':''';;-;---;;;;---
''''''''''''''''O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#I?''''''';;-";;;;;;;;;
'''''''''''''-/N@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@8O";;;;;;;;;;;;;;;---
'''''''''''"I@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@8+";;;;;;;;;------
''''''''''"O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O*";;';;;;;------
'''''''''-O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#O?";;----"""""
'''''''-=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S/"-//??/""""
'''''''$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S=/????/"---
'''''-I@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@NX+???/""---
''''-X@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#X=??//""""
''''?N@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@UI??/"""""
'''/S@@@@@$*IIO8#ON@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$N@@@@@@@@@@@@@@@@@@@@S?"-----"
'''/$@@@@#S*I$$88OON@@@@@@@@@@@@@@@@@@@@@@@@@@@NON@@@@@@@@@@@@@@@@@@@@$="------
:::/#@@NOZ@@@@@@$N8SOSN#@@@@@@@@@@@@@@@##N@@@@@NN@@@@@@@@@@@@@@@@@@@@@@@**";---
:::"$@@S*#@@@@@@@@@8OOSSN$@@@###@@@@##@$O$NNN@@@@@@@@@@@@@@@@@@@@@@@@@@@@*";---
:::/#@@OS@@@@@@@@@@@@@8OO=IOON$$8N@N$#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S?'';;
:::=@@@8$@@@@@@@@@@@@@@@N$8$S###$8@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@NI;'';
:::O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*;'';
::-N@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O-'';
:'+@@@@@@#O/=8@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@8/;';
:'*@@@@@@NO/;-*?O=="OX@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@N+;;-
::S@@@@@@NO"'...::..:::.:.../;==8I$I=/OINO@*X=N8@N@####N#####@@@@@@@@@@@@@@S?""
:"O@@@@@@N*-'..........:....:.:.;'''::'';'"";;-""+/OXNN#N#####@@@@@@@@@@@@@8?--
-8@@@@@@@8?:;ISI':.....:...............'..'';-"-;""/=O8N@@@@##@@@@@@@@@@@@@X";;
-$@##@@@@S-:'"S$*I;;:'.........:.:...':::';;-';--/?*X$#@@@@@#N@@@@@@@@@@@@@O=-;
:O@N$@@@#?..'-"-OO@N$NSS?/......'...::':'':--=IO$@@@@@@@@@#$###@@@@@@@@@@@@@@O/
:I@@N@@@$-:;---""==$@@@$8O//;"....''.::'':=**NN@@@@@@@@@@##8N##@@@@@@@@@@@@@@$?
:'IN##@@X:.;?+?/++OSN#@@@@@@@S-:..'..-?OSNN@@@@@@@@@@@@@@@@NO$##@@@@@@@@@@@@@N?
'..."S@N?.:;-?SN@@@@@@@@@@SS.... ..:-O@@#@@@@@@@@@@@@@@@@@#NS8#@@@@@@@@@@@@#*'
     I@$"..';+#@@O+@@@@@@@S" .... . "8@@@@@@@@@@@@@@@@@@@@@#8S$@@@@@@@@@@@@@$?.
::/S@#@#I..-/=+I$$@@@@@@@@@@$=.....''?ON##@@@@@@@@@@@@@#@@@#8O##@@@@@@@@@@@@@$
+/ -'?N8; .:;+;::?==XX*+;; ....  ..:"$@@@@@@@@@O?I@8ON@@@@#N$OX$@@@@@@@@@@@$///
;"+="/8X  ..''...''";/'"";          "O@@@@@@@S*?IOOOON@@@@@#NS*O@@@@@@@@@@#I/;/
.;;'?I$? ......  ..'; --    .......'/O@@@@@@@?';-"/=**SO$SS8##$OX$@@@@@@@#"I//;
.';::?N+  .....  ..'';-;  ........::+$@@@@@@@I:'-"/=**SO$SS8##$OX$@@@@@@@#/:;;/
.'-'+$*   .  .  ..';"-;  ......  :/S######@@@='.'-"-"?+IIO8N#8OO8@@@@NN8=///;;/
.'-';-*S   .  .    ';-'   ....    '+8#NN####@@O".:--"/??IIS$N#8OO$@@@@8$O?=::/
.';::-'I?... .....'''    ....     :?8@##NNNN@@NX-;;;;;-+*OO8NN@@@@@@@N8S+//-/:;
.;;:"I;++::: ....'.::    ....     :"S@@#N$N#@@#S/;''';"+*S8$N$@@@@@@@@#NO/;:;/
.'; '"-'";''' :......  ......     .-O#@@NN8N@@@8+;;-'/X8888$N$@@@@@@@@#O?:://
.'' .:;.';'.'':......  .....      .;XN@@P#N#@@@$I"--"*888$8$N$@@@@@@@@#O:/::/
.:' .   ::'':::'......  ... /='. .:=8@####N@@@@@8*?++*XO$N$N$$@@@@@@@@N;0;::
.::'...;:'':::'......  ... *@@=;'?"S#@@@#N@@@@@@#O*I*S8$NNNNNN@@@@@@@@;;/::
. :;'...;-':::.......... . .-/?;*#@@@@@@@@@@@@@@@@N$8#NN@#NNNN@@@@@@@;;;;;;
.. :'-.:+S=':::....... .. . .::':'/@@@@@@@@@@@@@@@@@@$N#N#N#NNN@@@@@   ;:;
   :'+';-;'':...  ..           ..:-=O@@@@@#N#@@@#N$$$$8$8$$$$$ON##O;;; ;;;
	 ';'::..... :;:       ...:'"/+SO@@@##N#@@NN$$$$888$$N$8S8$N::::;
	   '::......':   . .::::';--;?XOO*OONNN#@#$$$88888$$N$8"/.:::;
	   '::......:.   :..:::::';;-+XOOOXXS8$N@#N$$8$$$88$$$$O':::
	   '::......:....:. .   ... :"IOSOO88N$NNN$$$$$$$N$$$$*
	    '::::...:..::. . ;'/.. .'*IOSSO$$NNNN#8$$$N$$$$N$$=
	    ;':::...:-/X+SO@#@@@##$@@@@@8$88NNNNN#N$$$$$N$$$$8?
	     ':::. .'/II*"O"+-?SX@N@@@@@@@#$NN#NN#N$$$$$$$N$88?
	     '::::::'--::''''...:'''/?OO$$@@@@@@@@$$$$$$$$$8$$?
    	      ;':::''-;:::;/+X?/+-??**O8NN#N#@@@@$$$$$$$88NN$?
	       ;':::';;;;;-/?IOO#N@@@@@@@@#####@@8$N$N$$$8N##$=
===============;;'''''';;"/??+*IX+XX$#@@@@#@##@@@$$NNNN$$N#@@NI================
================;;'''''''';;;;--//??*X8N@@@@@@@@@@@##NNN#@@@@#O================
=================;;'''''''';':':;;-;"/**O8@N@#@@@@@##NN#@@@@@@8":==============
================== ;;;;'::::::::';;';"/+II=+//O8NNN$@@@@@@@@@$**NS=============
===================;;;;':::'''';;--;;/??IX**IXON##N##@@@@@@@@#NXI#NS"==========
====================;;;+""-""/"////?+***XOOSON#N@@@@@@@@@@@@@#N8S@@@?==========
=====================;"?++/++I===I=XXOXXXSO$$#NN@@@@@@@@@@@@@##@#@@@8==========
=================?;''''''+8N8#$#N#N@N#$NN###N#@@@@@@@@@###@@@@@@@@@@@@O========
=============. -O/'::':';+S@@@@@@@@@@@@@###@@@@@@@@@@#N#@@@@@@@@@@@@@@#O*-=====
============...?#S".:''';-?/8#8@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$=====
===============================================================================
*/
    
    public Principal()
    {
        try
        {
//            ServidorThread servidor = new ServidorThread();
//            servidor.start();
            
            Cliente asdf = new Cliente();
            
            asdf.start();
//            Generator generador = new Generator(100, 100);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Principal a = new Principal();
    }
    
}
