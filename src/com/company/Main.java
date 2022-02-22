package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
  int imageLength = 800;
  int imageHeight = 800;


  public void clear() throws IOException {
    BufferedImage img = new BufferedImage(imageLength, imageHeight, BufferedImage.TYPE_INT_RGB);
    for (int x = 0; x < imageLength; x++) {
      for (int y = 0; y < imageHeight; y++) {
        img.setRGB(x, y, 0 - 0 - 0);
      }
    }
    ImageIO.write(img, "png", new File("image.png"));
  }

  public void fillRect(int height, int lenght, int xStart, int yStart, int colour) throws IOException {
    BufferedImage img = new BufferedImage(imageLength, imageHeight, BufferedImage.TYPE_INT_RGB);
    for (int x = xStart; x < lenght; x++) {
      for (int y = yStart; y < height; y++) {
        img.setRGB(x, y, colour);
      }
    }
    ImageIO.write(img, "png", new File("image.png"));
  }

  public void drawRect(int height, int lenght, int xStart, int yStart, int colour) throws IOException {
    BufferedImage img = new BufferedImage(imageLength, imageHeight, BufferedImage.TYPE_INT_RGB);
    for (int x = xStart; x < lenght; x++) {
      img.setRGB(x, lenght, colour);
      for (int y = yStart; y < height; y++) {
        img.setRGB(height, x, colour);
      }
    }
    ImageIO.write(img, "png", new File("image.png"));
  }


  public static void main(String[] args) throws IOException {
    Main prg = new Main();

    prg.drawRect(400, 300, 50, 200, 0 - 0 - 255);
    //prg.clear();


  }
}
