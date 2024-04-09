
package Main;

import java.util.ArrayList;
import java.util.List;
import logica.VideoJuego;


public class Main {

    
    public static void main(String[] args) {
        
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123,"Otaku",
                "Nintendo 64",4,"Plataforma");
        VideoJuego video2 = new VideoJuego(423,"Rodrigo",
                "Nintendo 64",8,"Plataforma");
        VideoJuego video3 = new VideoJuego(2345,"AGE2",
                "PC",6,"Estrategia");
        VideoJuego video4 = new VideoJuego(23251,"HOI4",
                "PC",200,"Estrategia");
        VideoJuego video5 = new VideoJuego(1231234,"LOL",
                "PC",4,"Horrible");
        
        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);
        
        for(VideoJuego video:listaVideoJuegos){
            System.out.println("Titulo: "+video.getTitulo()+
                    " Consola: "+video.getConsola()+
                    " Cantidad Jugadores: "+video.getCantidadJugadores());
        }
        
        //cambio de nombre y jugadores
        video1.setTitulo("Otaku2");
        video1.setCantidadJugadores(2);
        video4.setTitulo("HOI3");
        video4.setCantidadJugadores(150);
        
        for(VideoJuego video:listaVideoJuegos){
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }            
        }
        
        
    }
    
}
