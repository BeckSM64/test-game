import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class CustomFonts {

    // Static fonts
    static Font retroComputer;
    
    static {

        // Attempt to setup the font
        try {
            InputStream is = CustomFonts.class.getResourceAsStream("/fonts/RetroComputer.ttf");
            retroComputer = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Setup all static fonts derived from retro computer true type font
    static Font font12 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 12);
    static Font font18 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 18);
    static Font font20 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 20);
    static Font font30 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 30);
    static Font font40 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 40);
    static Font font48 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 48);
    static Font font70 = CustomFonts.retroComputer.deriveFont(Font.PLAIN, 70);
}
