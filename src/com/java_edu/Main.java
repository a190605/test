package com.java_edu;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.util.Map;

import java.io.File;
import org.mp4parser.IsoFile;
import org.mp4parser.boxes.iso14496.part12.MovieHeaderBox;


public class Main {




    public static void main(String[] args) throws Exception {

//        try {
//            File file = new File("/Users/andriipavliuk/" +
//                    "1.wav");
//            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
//            AudioFormat format = audioInputStream.getFormat();
//            long frames = audioInputStream.getFrameLength();
//            double durationInSeconds = (frames + 0.0) / format.getFrameRate();
//            System.out.println("duration in seconds "+durationInSeconds);
////            AudioFileFormat audioFileFormat = AudioSystem.getAudioFileFormat(file);
////            Map<String, Object> properties = audioFileFormat.properties();
////            System.out.println("properties"+properties.size()+"empy::"+properties.isEmpty());
////            for(String key: properties.keySet()){
////                System.out.println(key  +" :: "+ properties.get(key).toString());
////            }
//        } catch (Exception e) {
//            System.out.println("Exception:::::" + e.getMessage());
//        }



        Blah.getAudioLength();


    }
}
