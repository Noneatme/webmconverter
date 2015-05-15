package de.noneatme.webmconverter;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * Created by Noneatme on 21.01.2015.
 */
public class cFileFormats
{
    public static final String fileFormats = "File formats:\n" +
            " D. = Demuxing supported\n" +
            " .E = Muxing supported\n" +
            " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
            " - MUXING -\t- FORMAT -\t- NAME -\n" +
            " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
            "  E\t3g2\t3GP2 (3GPP2 file format)\n" +
            "  E\t3gp\t3GP (3GPP file format)\n" +
            "  E\t4xm\t4X Technologies\n" +
            "  E\ta64\ta64 - video for Commodore 64\n" +
            "  D\taac\traw ADTS AAC (Advanced Audio Coding)\n" +
            "  DE\tac3\traw AC-3\n" +
            "  D\tact\tACT Voice file format\n" +
            "  D\tadf\tArtworx Data Format\n" +
            "  D\tadp\tADP\n" +
            "  E\tadts\tADTS AAC (Advanced Audio Coding)\n" +
            "  DE\tadx\tCRI ADX\n" +
            "  D\taea\tMD STUDIO audio\n" +
            "  D\tafc\tAFC\n" +
            "  DE\taiff\tAudio IFF\n" +
            "  DE\talaw\tPCM A-law\n" +
            "  D\talias_pix\tAlias/Wavefront PIX image\n" +
            "  DE\tamr\t3GPP AMR\n" +
            "  D\tanm\tDeluxe Paint Animation\n" +
            "  D\tapc\tCRYO APC\n" +
            "  D\tape\tMonkey's Audio\n" +
            "  D\tapng\tAnimated Portable Network Graphics\n" +
            "  D\taqtitle\tAQTitle subtitles\n" +
            "  DE\tasf\tASF (Advanced / Active Streaming Format)\n" +
            "  E\tasf_stream\tASF (Advanced / Active Streaming Format)\n" +
            "  DE\tass\tSSA (SubStation Alpha) subtitle\n" +
            "  DE\tast\tAST (Audio Stream)\n" +
            "  DE\tau\t Sun AU\n" +
            "  DE\tavi\tAVI (Audio Video Interleaved)\n" +
            "  D\tavisynth\tAviSynth script\n" +
            "  E\tavm2\tSWF (ShockWave Flash) (AVM2)\n" +
            "  D\tavr\tAVR (Audio Visual Research)\n" +
            "  D\tavs\tAVS\n" +
            "  D\tbethsoftvid\tBethesda Softworks VID\n" +
            "  D\tbfi\tBrute Force & Ignorance\n" +
            "  D\tbin\tBinary text\n" +
            "  D\tbink\tBink\n" +
            "  DE\tbit\tG.729 BIT file format\n" +
            "  D\tbmp_pipe\tpiped bmp sequence\n" +
            "  D\tbmv\tDiscworld II BMV\n" +
            "  D\tboa\tBlack Ops Audio\n" +
            "  D\tbrender_pix\tBRender PIX image\n" +
            "  D\tbrstm\tBRSTM (Binary Revolution Stream)\n" +
            "  D\tc93\tInterplay C93\n" +
            "  E\tcaca\tcaca (color ASCII art) output device\n" +
            "  DE\tcaf\tApple CAF (Core Audio Format)\n" +
            "  DE\tcavsvideo\traw Chinese AVS (Audio Video Standard) video\n" +
            "  D\tcdg\tCD Graphics\n" +
            "  D\tcdxl\tCommodore CDXL video\n" +
            "  D\tcine\tPhantom Cine\n" +
            "  D\tconcat\tVirtual concatenation script\n" +
            "  E\tcrc\tCRC testing\n" +
            "  E\tdash\tDASH Muxer\n" +
            "  DE\tdata\traw data\n" +
            "  DE\tdaud\tD-Cinema audio\n" +
            "  DE\tdecklink\tBlackmagic DeckLink output\n" +
            "  D\tdfa\tChronomaster DFA\n" +
            "  DE\tdirac\traw Dirac\n" +
            "  DE\tdnxhd\traw DNxHD (SMPTE VC-3)\n" +
            "  D\tdpx_pipe\tpiped dpx sequence\n" +
            "  D\tdsf\tDSD Stream File (DSF)\n" +
            "  D\tdshow\tDirectShow capture\n" +
            "  D\tdsicin\tDelphine Software International CIN\n" +
            "  DE\tdts\traw DTS\n" +
            "  D\tdtshd\traw DTS-HD\n" +
            "  DE\tdv\tDV (Digital Video)\n" +
            "  D\tdvbsub\traw dvbsub\n" +
            "  E\tdvd\tMPEG-2 PS (DVD VOB)\n" +
            "  D\tdxa\tDXA\n" +
            "  D\tea\tElectronic Arts Multimedia\n" +
            "  D\tea_cdata\tElectronic Arts cdata\n" +
            "  DE\teac3\traw E-AC-3\n" +
            "  D\tepaf\tEnsoniq Paris Audio File\n" +
            "  D\texr_pipe\tpiped exr sequence\n" +
            "  DE\tf32be\tPCM 32-bit floating-point big-endian\n" +
            "  DE\tf32le\tPCM 32-bit floating-point little-endian\n" +
            "  E\tf4v\tF4V Adobe Flash Video\n" +
            "  DE\tf64be\tPCM 64-bit floating-point big-endian\n" +
            "  DE\tf64le\tPCM 64-bit floating-point little-endian\n" +
            "  DE\tffm\tFFM (FFserver live feed)\n" +
            "  DE\tffmetadata\tFFmpeg metadata in text\n" +
            "  D\tfilm_cpk\tSega FILM / CPK\n" +
            "  DE\tfilmstrip\tAdobe Filmstrip\n" +
            "  DE\tflac\traw FLAC\n" +
            "  D\tflic\tFLI/FLC/FLX animation\n" +
            "  DE\tflv\tFLV (Flash Video)\n" +
            "  E\tframecrc\tframecrc testing\n" +
            "  E\tframemd5\tPer-frame MD5 testing\n" +
            "  D\tfrm\tMegalux Frame\n" +
            "  DE\tg722\traw G.722\n" +
            "  DE\tg723_1\traw G.723.1\n" +
            "  D\tg729\tG.729 raw format demuxer\n" +
            "  D\tgdigrab\tGDI API Windows frame grabber\n" +
            "  DE\tgif\tGIF Animation\n" +
            "  D\tgsm\traw GSM\n" +
            "  DE\tgxf\tGXF (General eXchange Format)\n" +
            "  DE\th261\traw H.261\n" +
            "  DE\th263\traw H.263\n" +
            "  DE\th264\traw H.264 video\n" +
            "  E\thds\tHDS Muxer\n" +
            "  DE\thevc\traw HEVC video\n" +
            "  E\thls\tApple HTTP Live Streaming\n" +
            "  D\thls\tapplehttp Apple HTTP Live Streaming\n" +
            "  D\thnm\tCryo HNM v4\n" +
            "  DE\tico\tMicrosoft Windows ICO\n" +
            "  D\tidcin\tid Cinematic\n" +
            "  D\tidf\tiCE Draw File\n" +
            "  D\tiff\tIFF (Interchange File Format)\n" +
            "  DE\tilbc\tiLBC storage\n" +
            "  DE\timage2\timage2 sequence\n" +
            "  DE\timage2pipe\tpiped image2 sequence\n" +
            "  D\tingenient\traw Ingenient MJPEG\n" +
            "  D\tipmovie\tInterplay MVE\n" +
            "  E\tipod\tiPod H.264 MP4 (MPEG-4 Part 14)\n" +
            "  DE\tircam\t Berkeley/IRCAM/CARL Sound Format\n" +
            "  E\tismv\tISMV/ISMA (Smooth Streaming)\n" +
            "  D\tiss\tFuncom ISS\n" +
            "  D\tiv8\tIndigoVision 8000 video\n" +
            "  DE\tivf\tOn2 IVF\n" +
            "  D\tj2k_pipe\tpiped j2k sequence\n" +
            "  DE\tjacosub\tJACOsub subtitle format\n" +
            "  D\tjpeg_pipe\tpiped jpeg sequence\n" +
            "  D\tjpegls_pipe\tpiped jpegls sequence\n" +
            "  D\tjv\tBitmap Brothers JV\n" +
            "  DE\tlatm\tLOAS/LATM\n" +
            "  D\tlavfi\t Libavfilter virtual input device\n" +
            "  D\tlibgme\tGame Music Emu demuxer\n" +
            "  D\tlibmodplug\tModPlug demuxer\n" +
            "  D\tlive_flv\tlive RTMP FLV (Flash Video)\n" +
            "  D\tlmlm4\t raw lmlm4\n" +
            "  D\tloas\tLOAS AudioSyncStream\n" +
            "  DE\tlrc\tLRC lyrics\n" +
            "  D\tlvf\tLVF\n" +
            "  D\tlxf\tVR native stream (LXF)\n" +
            "  DE\tm4v\traw MPEG-4 video\n" +
            "  E\tmatroska\tMatroska\n" +
            "  D\tmatroska,webm\tMatroska / WebM\n" +
            "  E\tmd5\tMD5 testing\n" +
            "  D\tmgsts\tMetal Gear Solid: The Twin Snakes\n" +
            "  DE\tmicrodvd\tMicroDVD subtitle format\n" +
            "  DE\tmjpeg\traw MJPEG video\n" +
            "  E\tmkvtimestamp_v2 extract pts as timecode v2 format, as defined by mkvtoolni\n" +
            "  DE\tmlp\traw MLP\n" +
            "  D\tmlv\tMagic Lantern Video (MLV)\n" +
            "  D\tmm\tAmerican Laser Games MM\n" +
            "  DE\tmmf\tYamaha SMAF\n" +
            "  E\tmov\tQuickTime / MOV\n" +
            "  D\tmov,mp4,m4a,3gp,3g2,mj\tQuickTime / MOV\n" +
            "  E\tmp2\tMP2 (MPEG audio layer 2)\n" +
            "  DE\tmp3\tMP3 (MPEG audio layer 3)\n" +
            "  E\tmp4\tMP4 (MPEG-4 Part 14)\n" +
            "  D\tmpc\tMusepack\n" +
            "  D\tmpc8\tMusepack SV8\n" +
            "  DE\tmpeg\tMPEG-1 Systems / MPEG program stream\n" +
            "  E\tmpeg1video\traw MPEG-1 video\n" +
            "  E\tmpeg2video\traw MPEG-2 video\n" +
            "  DE\tmpegts\tMPEG-TS (MPEG-2 Transport Stream)\n" +
            "  D\tmpegtsraw\traw MPEG-TS (MPEG-2 Transport Stream)\n" +
            "  D\tmpegvideo\traw MPEG video\n" +
            "  E\tmpjpeg\tMIME multipart JPEG\n" +
            "  D\tmpl2\tMPL2 subtitles\n" +
            "  D\tmpsub\tMPlayer subtitles\n" +
            "  D\tmsnwctcp\tMSN TCP Webcam stream\n" +
            "  D\tmtv\tMTV\n" +
            "  DE\tmulaw\tPCM mu-law\n" +
            "  D\tmv\tSilicon Graphics Movie\n" +
            "  D\tmvi\tMotion Pixels MVI\n" +
            "  DE\tmxf\tMXF (Material eXchange Format)\n" +
            "  E\tmxf_d10\tMXF (Material eXchange Format) D-10 Mapping\n" +
            "  D\tmxg\tMxPEG clip\n" +
            "  D\tnc\tNC camera feed\n" +
            "  D\tnistsphere\tNIST SPeech HEader REsources\n" +
            "  D\tnsv\tNullsoft Streaming Video\n" +
            "  E\tnull\traw null video\n" +
            "  DE\tnut\tNUT\n" +
            "  D\tnuv\tNuppelVideo\n" +
            "  E\toga\tOgg Audio\n" +
            "  DE\togg\tOgg\n" +
            "  DE\toma\tSony OpenMG audio\n" +
            "  E\topus\tOgg Opus\n" +
            "  D\tpaf\tAmazing Studio Packed Animation File\n" +
            "  D\tpictor_pipe\tpiped pictor sequence\n" +
            "  D\tpjs\tPJS (Phoenix Japanimation Society) subtitles\n" +
            "  D\tpmp\tPlaystation Portable PMP\n" +
            "  D\tpng_pipe\tpiped png sequence\n" +
            "  E\tpsp\tPSP MP4 (MPEG-4 Part 14)\n" +
            "  D\tpsxstr\tSony Playstation STR\n" +
            "  D\tpva\tTechnoTrend PVA\n" +
            "  D\tpvf\tPVF (Portable Voice Format)\n" +
            "  D\tqcp\tQCP\n" +
            "  D\tr3d\tREDCODE R3D\n" +
            "  DE\trawvideo\traw video\n" +
            "  D\trealtext\tRealText subtitle format\n" +
            "  D\tredspark\tRedSpark\n" +
            "  D\trl2\tRL2\n" +
            "  DE\trm\tRealMedia\n" +
            "  DE\troq\traw id RoQ\n" +
            "  D\trpl\tRPL / ARMovie\n" +
            "  D\trsd\tGameCube RSD\n" +
            "  DE\trso\tLego Mindstorms RSO\n" +
            "  DE\trtp\tRTP output\n" +
            "  E\trtp_mpegts\tRTP/mpegts output format\n" +
            "  DE\trtsp\tRTSP output\n" +
            "  DE\ts16be\tPCM signed 16-bit big-endian\n" +
            "  DE\ts16le\tPCM signed 16-bit little-endian\n" +
            "  DE\ts24be\tPCM signed 24-bit big-endian\n" +
            "  DE\ts24le\tPCM signed 24-bit little-endian\n" +
            "  DE\ts32be\tPCM signed 32-bit big-endian\n" +
            "  DE\ts32le\tPCM signed 32-bit little-endian\n" +
            "  DE\ts8\t PCM signed 8-bit\n" +
            "  D\tsami\tSAMI subtitle format\n" +
            "  DE\tsap\tSAP output\n" +
            "  D\tsbg\tSBaGen binaural beats script\n" +
            "  E\tsdl\tSDL output device\n" +
            "  D\tsdp\tSDP\n" +
            "  D\tsdr2\tSDR2\n" +
            "  E\tsegment\tsegment\n" +
            "  D\tsgi_pipe\tpiped sgi sequence\n" +
            "  D\tshn\traw Shorten\n" +
            "  D\tsiff\tBeam Software SIFF\n" +
            "  D\tsln\tAsterisk raw pcm\n" +
            "  DE\tsmjpeg\tLoki SDL MJPEG\n" +
            "  D\tsmk\tSmacker\n" +
            "  E\tsmoothstreaming Smooth Streaming Muxer\n" +
            "  D\tsmush\tLucasArts Smush\n" +
            "  D\tsol\tSierra SOL\n" +
            "  DE\tsox\tSoX native\n" +
            "  DE\tspdif\tIEC 61937 (used on S/PDIF - IEC958)\n" +
            "  E\tspx\tOgg Speex\n" +
            "  DE\tsrt\tSubRip subtitle\n" +
            "  D\tstl\tSpruce subtitle format\n" +
            "  E\tstream_segment,ssegment streaming segment muxer\n" +
            "  D\tsubviewer\tSubViewer subtitle format\n" +
            "  D\tsubviewer1\tSubViewer v1 subtitle format\n" +
            "  D\tsunrast_pipe\tpiped sunrast sequence\n" +
            "  D\tsup\traw HDMV Presentation Graphic Stream subtitles\n" +
            "  E\tsvcd\tMPEG-2 PS (SVCD)\n" +
            "  DE\tswf\tSWF (ShockWave Flash)\n" +
            "  D\ttak\traw TAK\n" +
            "  D\ttedcaptions\tTED Talks captions\n" +
            "  E\ttee\tMultiple muxer tee\n" +
            "  D\tthp\tTHP\n" +
            "  D\ttiertexseq\tTiertex Limited SEQ\n" +
            "  D\ttiff_pipe\tpiped tiff sequence\n" +
            "  D\ttmv\t8088flex TMV\n" +
            "  DE\ttruehd\traw TrueHD\n" +
            "  D\ttta\tTTA (True Audio)\n" +
            "  D\ttty\tTele-typewriter\n" +
            "  D\ttxd\tRenderware TeXture Dictionary\n" +
            "  DE\tu16be\tPCM unsigned 16-bit big-endian\n" +
            "  DE\tu16le\tPCM unsigned 16-bit little-endian\n" +
            "  DE\tu24be\tPCM unsigned 24-bit big-endian\n" +
            "  DE\tu24le\tPCM unsigned 24-bit little-endian\n" +
            "  DE\tu32be\tPCM unsigned 32-bit big-endian\n" +
            "  DE\tu32le\tPCM unsigned 32-bit little-endian\n" +
            "  DE\tu8\tPCM unsigned 8-bit\n" +
            "  E\tuncodedframecrc uncoded framecrc testing\n" +
            "  DE\tvc1\traw VC-1 video\n" +
            "  DE\tvc1test\tVC-1 test bitstream\n" +
            "  E\tvcd\tMPEG-1 Systems / MPEG program stream (VCD)\n" +
            "  D\tvfwcap\tVfW video capture\n" +
            "  D\tvivo\tVivo\n" +
            "  D\tvmd\tSierra VMD\n" +
            "  E\tvob\tMPEG-2 PS (VOB)\n" +
            "  D\tvobsub\tVobSub subtitle format\n" +
            "  DE\tvoc\tCreative Voice\n" +
            "  D\tvplayer\tVPlayer subtitles\n" +
            "  D\tvqf\tNippon Telegraph and Telephone Corporation (NTT) TwinVQ\n" +
            "  DE\tw64\tSony Wave64\n" +
            "  DE\twav\tWAV / WAVE (Waveform Audio)\n" +
            "  D\twc3movie\tWing Commander III movie\n" +
            "  E\twebm\tWebM\n" +
            "  DE\twebm_dash_manifest WebM DASH Manifest\n" +
            "  E\twebp\tWebP\n" +
            "  D\twebp_pipe\tpiped webp sequence\n" +
            "  DE\twebvtt\tWebVTT subtitle\n" +
            "  D\twsaud\tWestwood Studios audio\n" +
            "  D\twsvqa\tWestwood Studios VQA\n" +
            "  DE\twtv\tWindows Television (WTV)\n" +
            "  DE\twv\traw WavPack\n" +
            "  D\txa\tMaxis XA\n" +
            "  D\txbin\teXtended BINary text (XBIN)\n" +
            "  D\txmv\tMicrosoft XMV\n" +
            "  D\txwma\tMicrosoft xWMA\n" +
            "  D\tyop\tPsygnosis YOP\n" +
            "  DE\tyuv4mpegpipe\tYUV4MPEG pipe\n";

    public static void showInfo()
    {
        JPanel middlePanel = new JPanel ();
        middlePanel.setBorder(new TitledBorder(new EtchedBorder(), "FFMPEG Compatible File Formats"));

        // create the middle panel components

        JTextArea display = new JTextArea ( 40, 30 );
        display.setEditable ( false ); // set textArea non-editable
        display.setText(cFileFormats.fileFormats.replace(" ", " "));

        JScrollPane scroll = new JScrollPane ( display );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

        display.setCaretPosition(0);

        //Add Textarea in to middle panel
        middlePanel.add(scroll);

        // My code
        JFrame frame = new JFrame ();
        frame.add(middlePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
