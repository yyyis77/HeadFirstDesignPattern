public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer,
                             Projector projector, TheaterLights theaterLights, Screen screen){
        this.amplifier = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amplifier.off();
    }
}
