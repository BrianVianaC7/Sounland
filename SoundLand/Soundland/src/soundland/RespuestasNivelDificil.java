package soundland;

import java.util.StringTokenizer;

public class RespuestasNivelDificil {
    
    private String[] respuestasCorrectas={
        "thought showing hearing", "tonight fire rock and roll", "Look people system", "people's minor none",
         "crowd move break", "never water greed What", "walked more amused", "broke feeling conversation best", 
         "freshman should", "shook with mood"
    };
    
    
    private String[] opcionesResp={
        "thougth showeing wearing,thought showing hearing,trhought slowing earing,trought shoning earring",
        "tunight fire rock and roll,tonight fir rock and roll,tonight fire rock and roll,tonight fife rock and "
            +"roll",
        "Looking peoples sistem,Loo peope systems,Looc people sistema,Look people system",
        "people's minor none,peoples minior nones,peoples' minnior non,poeple's minnor noune",
        "cruwd move break,crowd move break,crowd muve break,crowd muve briak",
        "neve Waters greeding whot,nevers wate greeds What,never water greed What,neve wateers gree Whut",
        "walk more amussed,woke most amused,woked more amoused,walked more amused",
        "brooke feeling conversation best,broke feeleng conversation best,broke feeling conversasion best,broke "
            +"feeling conversation best",
        "freshmen what's,frehsman what,freshman should,frehsmen shouldn't",
        "shuuk with mood,shook with mood,shook wiht mood,shook with muud"
    };
    
    public String getRespuestaC(int pos){
        return respuestasCorrectas[pos];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token=new StringTokenizer(cadena,separador);
        String[] a=new String[4];
        int i=0;
        while(token.hasMoreTokens()){
            a[i]=token.nextToken();
            i++;
        }
        return a;
    }
    
    public String[] setRespuestas(int pos){
        String s=opcionesResp[pos];
        String[] s1=separar(s,",");
        return s1;
    }
    
}
