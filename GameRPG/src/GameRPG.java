import java.io.*;

public class GameRPG {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "elf", new String[] {"bow", "sword"});
        GameCharacter two = new GameCharacter(200, "troll", new String[] {"hands", "big axe"});
        GameCharacter three = new GameCharacter(100, "magician", new String[] {"spells", "invisibility"});

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            outputStream.writeObject(one);
            outputStream.writeObject(two);
            outputStream.writeObject(three);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) inputStream.readObject();
            GameCharacter twoRestore = (GameCharacter) inputStream.readObject();
            GameCharacter threeRestore = (GameCharacter) inputStream.readObject();

            System.out.println(oneRestore.getType());
            System.out.println(twoRestore.getType());
            System.out.println(threeRestore.getType());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}