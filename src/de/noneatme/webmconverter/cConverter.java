package de.noneatme.webmconverter;


import java.io.File;

/**
 * Created by Noneatme on 21.01.2015.
 */
public class cConverter
{
    public cConverterGUI gui;

    private File inputFile;
    private File outputFile;

    private Boolean running = false;

    public Process process;

    private cLoggerWorker worker;
    private Long startTick;

    public cConverter()
    {
        this.gui        = new cConverterGUI(this);

    }

    public boolean setInputFile(File file)
    {
        this.inputFile      = file;
        return true;
    }

    public boolean setOutputFile(File file)
    {
        this.outputFile     = file;
        return true;
    }

    private void reset()
    {
        this.gui.resetComps((int) ((System.currentTimeMillis()-this.startTick)/1000));

        this.inputFile      = null;
        this.outputFile     = null;

    }

    public void startConvert(int iBitrate, boolean sound, String resolution)
    {
        if(!this.running)
        {
            this.running = true;

            this.startTick = System.currentTimeMillis();
            // Process Builder /7


            String an   = "";

            String res  = resolution;
            String res2 = "";

            if(!res.equals(""))
            {
                res2    = "-s";
            }

            if(!sound)
            {
                an = "-an";
            }

            ProcessBuilder builder    = new ProcessBuilder("ffmpeg/ffmpeg.exe", "-i", this.inputFile.getAbsolutePath(), "-c:v", "libvpx", "-minrate", iBitrate + "k", "-maxrate", iBitrate + "k", "-b:v", iBitrate + "k", "-c:a", "libvorbis", an, res2, res, this.outputFile.getAbsolutePath());
            builder.redirectErrorStream(true);
            builder.redirectOutput();


            try
            {
                this.process = builder.start();
                // THREAD //

               /* this.loggerThread   = new Thread(new cProcessLoggerThread(process.getInputStream (), process.getErrorStream(), this));
                this.loggerThread.run();
                */
                worker = new cLoggerWorker(process.getInputStream (), process.getErrorStream(), this);
                worker.execute();


            }
            catch (Exception ex)
            {
                this.gui.addConsoleString(ex.toString());
            }
        }
    }

    public void stopConvert()
    {
        if(this.running)
        {
            this.worker.cancel(true);
            this.worker.done();

            this.process.destroy();

            this.reset();
            this.running = false;
        }
    }

}
