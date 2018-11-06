import java.io.File;

import org.junit.Test;

public class TextConnectionParserTest {

    @Test
    public void abc9() throws Exception {
        File file = new File("/home/wowik/IdeaProjects/TicketMachine/src/main/resources/connections.txt");
        TextConnectionParser parser = new TextConnectionParser();
        parser.parseText(file);
    }

}