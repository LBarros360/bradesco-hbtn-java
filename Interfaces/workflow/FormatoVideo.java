public enum FormatoVideo {

    MPEG("MPEG"),
    AVI("AVI"),
    WMV("WMV"),
    MP4("MP4"),
    MKV("MKV");

    private String formatoVideo;


    FormatoVideo(String formatoVideo) {
        this.formatoVideo = formatoVideo;
    }

    public String getFormatoVideo() {
        return this.formatoVideo;
    }
}

