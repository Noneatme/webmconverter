package de.noneatme.webmconverter;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Noneatme on 21.01.2015.
 */
public class cLoggerWorker extends SwingWorker<String, Object>
{
    private InputStream in;
    private InputStream out;

    private BufferedReader reader1;
    private BufferedReader reader2;

    private cConverter conv;

    public cLoggerWorker(InputStream in, InputStream out, cConverter conv)
    {
        this.in     = in;
        this.out    = out;
        this.conv   = conv;

        reader1     = new BufferedReader(new InputStreamReader(in));
        reader2     = new BufferedReader(new InputStreamReader(out));

    }

    @Override
    public String doInBackground()
    {
        String line;
        try
        {

            while((line = reader1.readLine()) != null)
            {
                conv.gui.addConsoleString(line);

                // CHECK FFMPEG END //
                if(line.substring(0, 6).equals("video:")) // Naja scheisse aber was solls
                {
                    conv.stopConvert();
                }

                // SEARCH FOR DURATION STRING //

                String search       = "Duration:";
                int startIndex      = line.indexOf(search);
                if(startIndex != -1)
                {
                    conv.gui.updateDuration(line.substring(search.length() + startIndex+1, search.length() + 14), true);
                }

                // SEARCH FOR FRAME STRING //

                search              = "frame=";
                if(line.substring(0, search.length()).equals(search))
                {
                    conv.gui.updateDuration(line.substring(search.length()+41, search.length()+41+11), false);
                }

                // ERROR? //
                if((line = reader2.readLine()) != null)
                {
                    conv.gui.addConsoleString(line);
                }

            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return "";
    }

    @Override
    protected void done()
    {
        try
        {

        }
        catch (Exception ignore)
        {

        }
    }

}
