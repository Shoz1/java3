package com.bosuk.lab_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Circles {
    ArrayList<Circle> circles;

    public Circles(){
        circles = new ArrayList<>();
    }

    public static String maxSquare(final ArrayList<Circle> circles)
    {
        double max = circles.get(0).getSquare();
        for (Circle circle : circles) {
            if (circle.getSquare() > max) {
                max = circle.getSquare();
            }
        }
        return "\nMax square of a circle: " + max;
    }

    public void clear() {
        this.circles.clear();
    }

//    public void save(String filename) throws IOException {
//        FileWriter fw = new FileWriter(filename);
//        BufferedWriter bw = new BufferedWriter(fw);
//        for (int i = 0; i < circles.size(); i++) {
//            try {
//                bw.write("\nCircle " + i);
//                bw.write("\n");
//                bw.write(String.valueOf(circles.get(i).getRadius()));
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        bw.close();
//        fw.close();
//    }
//
//    public void load(String filename) throws IOException {
//        this.clear();
//        Scanner scanner = new Scanner(new FileReader(filename));
//        double radius = 1.0;
//        int counter = 0;
//        scanner.nextLine();
//        while (scanner.hasNextLine()) {
//            if(counter % 2 != 0) {
//                    radius = Double.valueOf(scanner.nextLine());
//                    this.circles.add(new Circle(radius));
//            }
//            else
//                scanner.nextLine();
//            counter++;
//        }
//        scanner.close();
//    }
//


}
