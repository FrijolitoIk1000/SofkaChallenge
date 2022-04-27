/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sofkachallenge;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class SofkaChallenge {
    static ArrayList<Player> players = new ArrayList();//ArrayList para los Jugadores
    public static void main(String[] args) {
    
        int min = 0; //Minimo de la funcion random
        int max = 4;//Maximo de la funcion random
        int score = 0;//Contador del puntaje
        int jugador = 0;//Contador de jugadores
        //Preguntas Categoria 1
        String q1c1 = ("¿Cuál fue primero?\n (a)Pac-Man (c)Pong \n (b)Tretis (d)Donkey Kong");//Pong
        String q2c1 = ("¿Cómo se llama el hermano de Mario Bros?\n (a)Luigi (c)Mario Jr \n (b)Honguito (d)Luis");//Luigi
        String q3c1 = ("¿Cuántas entradas para mandos tiene Nintendo 64?\n (a)2 (c)4 \n (b)1 (d)6");//4
        String q4c1 = ("¿Cómo se llama el enemigo de Sonic?\n (a)Dr. Malo (c)Robotech \n (b)Tails (d)Dr. Robonitk");//Dr. Robonitk
        String q5c1 = ("¿Cuál fue la primera consola de PlayStation?\n (a)Ps Project (c)Play One \n (b)PS1 (d)PlayStation Origin");//PS1
        //Preguntas Categoria 2
        String q1c2 = ("¿Cuáles son los dos luchadores que siempre han aparecido en todas las versiones de Street Fighter?\n (a)Ken y Blanca (c)Ken y Guile \n (b)Ryu y M. Bison (d)Ken y Ryu");//Ken y Ryu
        String q2c2 = ("¿Qué instrumento de viento suele usar Link de The Legend of Zelda?\n (a)Flauta (c)Saxofón \n (b)Armónica (d)Ocarina");//Ocarina
        String q3c2 = ("¿De qué personaje busca venganza Kratos en God of war?\n (a)Atenea (c)Ares \n (b)Zeus (d)Poseidon");//Ares
        String q4c2 = ("¿Cómo se llama el protagonista de Halo?\n (a)Jefe Maestro (c)Comandante Maestro \n (b)John (d)Soldado Maestro");//Jefe Maestro
        String q5c2 = ("¿Qué es “lag”?\n (a)Retardo producido por una telecomunicación en tiempo real (c)Un fenomeno inexplicabe \n (b)Lo peor que te puede pasar (d)La pesadilla de todo gamer");//Retardo producido por una telecomunicación en tiempo real
        //Preguntas Categoria 3
        String q1c3 = ("¿Cuánto tiempo se tenía para terminar Principe de Persia?\n (a)120 minutos (c)40 minutos \n (b)30 minutos (d)60 minutos");//60 minutos
        String q2c3 = ("¿Cómo se llama el hijo adoptado de Heihachi de Tekken?\n (a)Liuncachi (c)Kasumi \n (b)Kazuya (d)Lars");//Kayuza
        String q3c3 = ("¿Cómo se llama la institución mental que sirve de escenario a Outlast?\n (a)Hospital Severalls (c)Hospital Massive \n (b)Hospital Estatal de filadelfia (d)Hospital Whittingham");//Hospital Massive
        String q4c3 = ("¿En qué año fue lanzado Super Mario 64?\n (a)1995 (c)1998 \n (b)1996 (d)1999");//1996
        String q5c3 = ("¿Cómo se llama el fundador de la compañía Nintendo?\n (a)Shigeru Miyamoto (c)Hideo Kojima \n (b)Satoru Iwata (d)Fusajiro Yamauchi");//Fusajiro Yamauchi
        //Preguntas Categoria 4
        String q1c4 = ("¿Cuál fue el primer nombre de Lara Croft?\n (a)Lara Brown (c)Lara Davies \n (b)Stephanie Davies (d)Laura Cruz");//Laura Cruz
        String q2c4 = ("¿En qué juego se desató una plaga virtual tan fatal, que resultó en que los jugadores tuvieran que ser puestos en cuarentena?\n (a)Final Fantasy XIV (c)Old School RuneScape \n (b)World of Warcraft (d)The Elder Scrolls Online");//World of Warcraft
        String q3c4 = ("¿El juego Assassin's Creed iba originalmente a ser un spin-off de qué juego?\n (a)The Legend of Zelda (c)God of War \n (b)El principe de persia (d)Mario Bros");//El principe de persia
        String q4c4 = ("¿Cuál es la consola más vendida de todos los tiempos?\n (a)PlayStation 2 (c)PlayStation 1 \n (b)Xbox 360 (d)Nintedo DS");//PlayStation 2
        String q5c4 = ("¿Cuál es el videojuego más vendido de todos los tiempos?\n (a)Super Mario Bros (c)Wii Sports \n (b)Grand Theft Auto V (d)Minecraft");//Minecraft
        //Preguntas Categoria 5
        String q1c5 = ("¿Qué actor casi pierde un protagónico en una película por no responder una llamada, ya que estaba jugando una partida de World of Warcraft?\n (a)Hugh Jackman (c)Henry Cavill \n (b)Joey Batey (d)Ben Affleck");//Henry Cavill
        String q2c5 = ("¿Qué banda/artista ganó más dinero con los derechos de autor de los juegos de Guitar Hero que con cualquier álbum vendido?\n (a)Aerosmith (c)The Beatles \n (b)Jimi Hendrix (d)Oasis");//Aerosmith
        String q3c5 = ("¿Aproximadamente cuántas personas juegan a Roblox cada mes?\n (a)7 millones (c)125 millones \n (b)2 millones (d)200 millones");//200 millones
        String q4c5 = ("El videojuego deportivo más popular de todos los tiempos lleva el nombre de un exentrenador profesional, ¿cuál es el nombre?\n (a)John Madden (c)Joe Torre \n (b)Phil Jackson (d)Tom Landry");//John Madden
        String q5c5 = ("¿Qué popular juego inspiró una canción pop que figuró en la lista de los Billboard Top 10 en 1982?\n (a)Space Invaders (c)Frogger \n (b)Pac-Man (d)Asteroids");//Pac-Man
        
        Questions [] Questions = {
            new Questions(q1c1,"c"),
            new Questions(q2c1,"a"),
            new Questions(q3c1,"c"),
            new Questions(q4c1,"d"),
            new Questions(q5c1,"b"),
            new Questions(q1c2,"d"),
            new Questions(q2c2,"d"),
            new Questions(q3c2,"c"),
            new Questions(q4c2,"a"),
            new Questions(q5c2,"a"),
            new Questions(q1c3,"d"),
            new Questions(q2c3,"b"),
            new Questions(q3c3,"c"),
            new Questions(q4c3,"b"),
            new Questions(q5c3,"d"),
            new Questions(q1c4,"d"),
            new Questions(q2c4,"b"),
            new Questions(q3c4,"b"),
            new Questions(q4c4,"a"),
            new Questions(q5c4,"d"),
            new Questions(q1c5,"c"),
            new Questions(q2c5,"a"),
            new Questions(q3c5,"d"),
            new Questions(q4c5,"a"),
            new Questions(q5c5,"b"),
            
        };
        
        PlayGame(Questions,min,max,score,jugador);
        mostrarJugadores();
        
    }
    
    //Metodo del juego recursivo
    public static void PlayGame(Questions [] Questions,int min,int max,int score,int jugador){
        Player aux;//Variable auxiliar para cada jugador nuevo
        aux = new Player(); //Se crea un objeto player
        Random r = new Random();
        if(score==5){
                JOptionPane.showMessageDialog(null,"Felicidades ganaste el juego jugador "+jugador+"\n Tu puntaje es "+score);
                 aux.setId(jugador);
                 aux.setScore(score);
                 players.add(aux);
                int result = JOptionPane.showConfirmDialog(null,"¿Desea seguir jugando?","Salida",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                    score=0;
                    jugador++;
                    min = 0;
                    max = 4;
                    PlayGame(Questions,min,max,score,jugador);
                }
        }
        else{
        int a = r.nextInt(max-min+1)+min;
        String answer = JOptionPane.showInputDialog(null,Questions[a].getText());
        if (answer!=null){
            if (answer.equals(Questions[a].getAnswers())){
                score++;
                max = max + 5;
                min = min + 5;                
                PlayGame(Questions,min,max,score,jugador);
            }   
            else
            {
                JOptionPane.showMessageDialog(null,"Lastima jugador "+jugador+" Perdiste Tu puntaje es "+score);
                aux.setId(jugador);
                aux.setScore(score);
                players.add(aux);
                int result = JOptionPane.showConfirmDialog(null,"¿Desea seguir jugando?","Salida",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                jugador++;
                min = 0;
                max = 4;
                score = 0;
                PlayGame(Questions,min,max,score,jugador);
                }
            } 
        }
            else{
            JOptionPane.showMessageDialog(null,"Jugador "+jugador+" Tu puntaje es "+score);
            aux.setId(jugador);
            aux.setScore(score);
            players.add(aux);
            int result = JOptionPane.showConfirmDialog(null,"¿Desea seguir jugando?","Salida",JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){ 
                jugador++;
                min = 0;
                max = 4;
                score = 0;
                PlayGame(Questions,min,max,score,jugador);
            } 
            } 
        }             
    }
    
    public static void mostrarJugadores(){      
        for(int i = 0; i< players.size(); i++)
            System.out.println(players.get(i));  //Se invoca el método toString de la clase Player                 
    }
}
