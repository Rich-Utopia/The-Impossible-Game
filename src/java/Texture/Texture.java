package Texture;

import java.awt.image.BufferedImage;

import Main.StateHandler;

public class Texture {
	private SpriteSheet bs, ps, os;
    private BufferedImage block_sheet = null;
    private BufferedImage player_sheet = null;
    
    public BufferedImage[] block = new BufferedImage[4];
    public BufferedImage[] player = new BufferedImage[6];
    
    private StateHandler statesHandler;
    public Texture(StateHandler statesHandler)//wird in der init() Methode durchgeführt
    {
        this.statesHandler = statesHandler;
        ReadImage loader = new ReadImage();        
        
        bs = new SpriteSheet(loader.loadImage("/Texture/BlockSheet.png"));//Läd das Bild wo alle Blöcke eingespeichert werden
        ps = new SpriteSheet(loader.loadImage("/Texture/PlayerSheet.png"));//Läd das Bild wo alle Spieler States abgebildet sind
        
        getTextures();
    }
    
    public void getTextures(){//läd die Bilder aus den Grossen Bilder und seichert sie in dei beiden Arrays ab
        block[0] = bs.grabImage(3, 1, 128, 128);//Zaun
        block[1] = bs.grabImage(1, 1, 128, 128);//Wand
        block[2] = bs.grabImage(4, 1, 128, 128);//Ziel
        block[3] = bs.grabImage(2, 1, 128, 128);//Boden
        
        player[0] = ps.grabImage(1, 1, 32, 32);
        player[1] = ps.grabImage(2, 1, 32, 32);
        player[2] = ps.grabImage(3, 1, 32, 32);
        player[3] = ps.grabImage(4, 1, 32, 32);
        player[4] = ps.grabImage(5, 1, 32, 32);
        player[5] = ps.grabImage(6, 1, 32, 32); 
           
    }
}
