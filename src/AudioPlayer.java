class AudioPlayer extends StreamingAudioPlayer{

    public static void main(String[] args){
        boolean result;

        AudioPlayer test = new AudioPlayer();
        result = test.openSpeaker("Beto");
        System.out.println(result);
    }
}

class StreamingAudioPlayer {

    protected boolean openSpeaker(String sp) {
        if(sp == "Beto") {
            return true;
        }
        return false;
    }
}