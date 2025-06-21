public class LightOffCommand implements Command {
    private Light  obj;

    public LightOffCommand(Light  obj) {
        this.obj=obj;
    }
    @Override
    public void execute(){
        this.obj.lightsOff();
    }
    
}
