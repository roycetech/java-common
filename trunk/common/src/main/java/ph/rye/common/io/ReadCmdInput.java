package ph.rye.common.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCmdInput {

    /**
     * Read input from command line.
     * 
     * @throws IOException if error occurs while reading from the input stream.
     */
    public String readInput() throws IOException
    {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } finally {
            bufferedReader.close();
        }
    }

}