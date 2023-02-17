package soundland;

import java.util.StringTokenizer;

public class RespuestasNivelFacil {
    
    private String[] respuestasCorrectas={
        "hangs violence mistaken", "inner thankfulness meaning", "between whores bed Whores", "Insane "
            +"myself heat", "stupid having helpless equal", "theme sixteen fighting", "heart However "
            +"written", "man adored choir", "havoc ratchet unstoppable", "Newton Hawking pep walking"
    };
    
    
    private String[] opcionesResp={
        "heads violences mistaken,hangs violences mistaken,hangs violence mistaken,hangs violence mistoken",
        "inner drankfulness meaning,inner thankfulness meaning,innair thankfulness maning,inner thankfulness "
            +"feeling",
        "between whores bed Whores,between wars bed Wars,between whores bet Wars,between whores bet Whores",
        "Insante maiself heat,Insane myself heart,Insaint myselft heat,Insane myself heat",
        "stupid having helpless equal,stupid graving helpness equal,stupid having helpness equal,stupid having helpless echual",
        "theme sixteen fighting,there sixteen flighting,there sixteen fighting,there sixtin fighting",
        "heart Whoever writen,heat However written,heart Whatever written,heart However written",
        "man adored choir,main adored choir,mall adobe choir,march adored choir",
        "havot ratchet unstoppable,havoc ratcher unstoppabled,havoct ratcheted unstoppabled,havoc ratchet unstoppable",
        "Newton Hawking pep walking,Newton Walking pep walking,Newton Hawking beer walking,Newton Hawking pep drawing"
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
