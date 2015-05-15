package de.noneatme.webmconverter;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Noneatme on 21.01.2015.
 */
public class cConverterGUI extends JFrame
{
    private JTextField resolutionTextfield;
    private JTextField inputTextfield;
    private JTextField outputTextfield;
    private JFormattedTextField bitrateTextfield;

    private JProgressBar bar;

    private JFileChooser chooser1;

    private JPanel      panel;

    private JLabel progLabel;

    private JTextArea   consoleArea;


    private JButton     startButton;
    private JButton     stopButton;

    private JButton btn2;
    private JButton btn1;

    private JCheckBox boxSound;

    private cConverter converter;
    private String extension    = ".webm";

    public String duration      = "00:00:00.00";
    private String curDuration  = "00:00:00.00";

    public cConverterGUI(cConverter conv)
    {
        super("Converter GUI");

        this.converter      = conv;

        setTitle("Noneatmes *.* to .webM converter GUI");
        setSize(408, 588);

        setVisible(true);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        this.buildThings();
    }

    private void buildThings()
    {
        setLayout(null);

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon.jpg")));

        panel               = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED));

        panel.setBounds(4, 4, this.getWidth()-12, this.getHeight()-40);
        panel.setLayout(null);


        JLabel lab1         = new JLabel("Select input file: ");
        lab1.setBounds(5, 1, 100, 30);

        inputTextfield      = new JTextField();
        inputTextfield.setBounds(5, 30, 200, 20);
        inputTextfield.setEditable(false);

        btn1        = new JButton("Select");
        btn1.setBounds(210, 30, 80, 20);

        JButton btnFileFormats        = new JButton("(?)");
        btnFileFormats.setBounds(292, 30, 80, 20);

        JLabel lab2         = new JLabel("Select output file: ");
        lab2.setBounds(5, 45, 150, 30);

        outputTextfield      = new JTextField();
        outputTextfield.setBounds(5, 70, 200, 20);
        outputTextfield.setEditable(false);


        btn2        = new JButton("Select");
        btn2.setBounds(210, 70, 80, 20);
        btn2.setEnabled(false);

        chooser1            = new JFileChooser();
      //  chooser1.setFileFilter(new FileNameExtensionFilter("Video Formats", "*"));

        JLabel lab3         = new JLabel(" Bitrate: (Constant Bitrate)");
        lab3.setBounds(5, 100, 250, 30);


        NumberFormatter formatter = new NumberFormatter(NumberFormat.getInstance());
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(100000);
        formatter.setCommitsOnValidEdit(true);
        formatter.setAllowsInvalid(false); //this is the key!!

        bitrateTextfield    = new JFormattedTextField(formatter);
        bitrateTextfield.setBounds(5, 125, 80, 20);

        bitrateTextfield.setText("1000");

        JLabel lab4         = new JLabel("Kilobits / second");
        lab4.setBounds(90, 120, 250, 30);


        resolutionTextfield = new JTextField();
        resolutionTextfield.setBounds(5, 172, 80, 20);
        resolutionTextfield.setText("640x480");
        resolutionTextfield.setEnabled(false);

        JLabel labres         = new JLabel("Resolution");
        labres.setBounds(5, 146, 250, 30);

        JCheckBox boxVorbis = new JCheckBox("Ogg Vorbis");
        boxVorbis.setBounds(250, 125, 100, 20);


        final JCheckBox boxResNoChange = new JCheckBox("Don't change");
        boxResNoChange.setBounds(90, 166, 150, 30);
        boxResNoChange.setSelected(true);

        boxSound = new JCheckBox("Enable Sound");
        boxSound.setBounds(250, 150, 120, 20);

        boxVorbis.setEnabled(false);
        boxVorbis.setSelected(true);

        boxSound.setEnabled(true);
        boxSound.setSelected(true);


        int yAdd        = 50;

        JLabel lab5         = new JLabel("Progress:");
        lab5.setBounds(5, 160+yAdd, 250, 30);

        bar                 = new JProgressBar();
        bar.setBounds(5, 190+yAdd, 385, 30);
        bar.setMinimum(0);
        bar.setMaximum(100);
        bar.setStringPainted(true);


        JLabel lab6         = new JLabel("Console:");
        lab6.setBounds(5, 220+yAdd, 150, 30);

        consoleArea         = new JTextArea();
        consoleArea.setEditable(false);
        consoleArea.setLineWrap(true);

        JScrollPane consolePane = new JScrollPane(consoleArea);
        consolePane.setBounds(5, 250+yAdd, 385, 200);


        startButton         = new JButton("Start");
        startButton.setBounds(5, 460+yAdd, 160, 30);
        startButton.setEnabled(false);

        stopButton         = new JButton("Cancel");
        stopButton.setBounds(230, 460+yAdd, 160, 30);
        stopButton.setEnabled(false);

        panel.add(lab1);
        panel.add(lab2);
        panel.add(lab3);
        panel.add(lab4);
        panel.add(lab5);
        panel.add(lab6);
        panel.add(labres);


        panel.add(consolePane);

        panel.add(boxVorbis);
        panel.add(boxSound);
        panel.add(boxResNoChange);
        panel.add(inputTextfield);
        panel.add(outputTextfield);
        panel.add(bitrateTextfield);
        panel.add(resolutionTextfield);

        panel.add(btn2);
        panel.add(btn1);
        panel.add(btnFileFormats);
        panel.add(startButton);
        panel.add(stopButton);

        panel.add(bar);

        this.add(panel);

        boxResNoChange.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(!boxResNoChange.isSelected())
                {
                    resolutionTextfield.setEnabled(true);
                }
                else
                {
                    resolutionTextfield.setEnabled(false);
                }
            }
        });

        btnFileFormats.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                cFileFormats.showInfo();
            //   JOptionPane.showMessageDialog(null, cFileFormats.fileFormats, "FFMPEG Compatible File Formats", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                chooser1.resetChoosableFileFilters();
                chooser1.setFileFilter(null);
                chooser1.setAcceptAllFileFilterUsed(true);

                int returnVal = chooser1.showOpenDialog(null);

                if(returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser1.getSelectedFile();
                    if(file.exists())
                    {
                        inputTextfield.setText(file.getAbsolutePath());
                        inputTextfield.setToolTipText(file.getAbsolutePath());

                        converter.setInputFile(file);

                        btn2.setEnabled(true);
                        addConsoleString("Input File: " + file.getAbsolutePath());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please select an existing file!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                chooser1.resetChoosableFileFilters();
                chooser1.setFileFilter(new FileNameExtensionFilter("WebM File", "webm"));
                chooser1.setAcceptAllFileFilterUsed(false);

                int returnVal = chooser1.showSaveDialog(null);

                if(returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser1.getSelectedFile();

                    File tempFile   = new File(file.getAbsolutePath() + extension);

                    if(tempFile.exists())
                    {
                        int res = JOptionPane.showConfirmDialog(null, "Do you want to overwrite that file?\n" + file.getName(), "Question", JOptionPane.YES_NO_OPTION);
                        if(res == JOptionPane.YES_OPTION)
                        {
                            setOutputFile(file);
                        }
                    }
                    else
                    {
                        setOutputFile(file);
                    }


                }
            }
        });


        startButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int res     = JOptionPane.showConfirmDialog(null, "Do you really want to start the operation?\nPlease Note: The operation can take some time.\nFFMPEG is also known for being slow, the converter is doing his work as fast as he can.", "Warning", JOptionPane.YES_NO_OPTION);
                if(res == JOptionPane.YES_OPTION)
                {
                    addConsoleString("\nStarting Converter...");

                    try
                    {
                        String reso          = "";

                        if(resolutionTextfield.isEnabled())
                        {
                            reso             = resolutionTextfield.getText();
                        }

                        converter.startConvert(((Long) NumberFormat.getIntegerInstance().parse(bitrateTextfield.getText())).intValue(), boxSound.isSelected(), reso);
                    }
                    catch(Exception ex)
                    {
                        addConsoleString(ex.toString());
                    }

                    startButton.setEnabled(false);
                    stopButton.setEnabled(true);
                }
            }
        });

        stopButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int res     = JOptionPane.showConfirmDialog(null, "Do you really want to stop the operation?\nPlease Note: Your file will be corrupt!", "Warning", JOptionPane.YES_NO_OPTION);
                if(res == JOptionPane.YES_OPTION)
                {
                    converter.stopConvert();
                }
            }
        });

        this.repaint();

    }

    public boolean addConsoleString(String s)
    {
        this.consoleArea.setText(this.consoleArea.getText() + s + "\n");

        this.consoleArea.setCaretPosition(this.consoleArea.getText().length());
        return true;
    }

    public void setOutputFile(File file)
    {
        String path     = file.getAbsolutePath();
        path            = path + this.extension;

        file            = new File(path);

        try
        {
            file.delete();
        }
        catch(Exception ex)
        {
            addConsoleString(ex.getStackTrace().toString());
            ex.printStackTrace();
        }

        outputTextfield.setText(file.getAbsolutePath());
        outputTextfield.setToolTipText(file.getAbsolutePath());

        converter.setOutputFile(file);

        addConsoleString("Output File: " + file.getAbsolutePath());


        this.startButton.setEnabled(true);
        this.stopButton.setEnabled(false);
    }

    public void resetComps(int iSeconds)
    {
        this.inputTextfield.setText("");
        this.outputTextfield.setText("");

        this.startButton.setEnabled(false);
        this.stopButton.setEnabled(false);

        this.btn2.setEnabled(false);

        addConsoleString("\nConverting Finished! Time: " + iSeconds + " seconds");

        this.bar.setValue(0);

        bar.setString("0%");
    }

    public void disableAll()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);

    }

    public void updateDuration(String substring, boolean beginning)
    {
        if(beginning)
            this.duration       = substring;
        else
            this.curDuration    = substring;

        int progress    = (int) getCurrentProgress();
        bar.setValue(progress);

        bar.setString(progress + "%");
    }


    public double getCurrentProgress()
    {
        if(this.duration != null && this.curDuration != null)
        {
            try
            {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
                sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

                Date date   = sdf.parse("1970-01-01 " + this.duration);
                Date date2  = sdf.parse("1970-01-01 " + this.curDuration);


                return (100-(((date.getTime() - date2.getTime())*100) / date.getTime()));
            }
            catch(Exception ex)
            {

                return 0;
            }
        }
        return 0;
    }
}
