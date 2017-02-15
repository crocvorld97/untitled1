/**
 * Created by NotePad.by on 17.11.2016.
 */
public class Training
{
    public static void main(String[] args)
    {
        TextReceiver x;

        TickerTape a = new TickerTape();
        a.receiveText("Information!");
        x = a;
        TextSourse b = new TextSourse(x);
        b.sendText("New Information!");
        x.receiveText("Странно");

    }
}

interface TextReceiver
{
    void receiveText (String text);
}

class TickerTape implements TextReceiver
{
    public void receiveText(String text)
    {
        System.out.println("Ticker:\n" + text + "\n");
    }
}

class TextSourse
{
    TextReceiver receiver;
    TextSourse(TextReceiver r)
    {
        receiver = r;
    }

    public void sendText (String s)
    {
        receiver.receiveText(s);
    }
}


