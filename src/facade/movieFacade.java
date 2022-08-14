package facade;

public class movieFacade {
    private Popper popper;
    private Light light;
    private Screen screen;
    private Projector projector;
    private Amplifier amp;
    private Player player;

    public void watchMovie(String movie){
    	System.out.println("영화 볼 준비 중");
    	popper.on();
    	popper.pop();
    	light.dim(10);
    	screen.down();
    	projector.on();
    	projector.wideScreenMode();
    	amp.on();
    	amp.setStreamingPlayer(player);
    	amp.setVolume(5);
    	player.on();
    	player.play(movie);
    }

}
