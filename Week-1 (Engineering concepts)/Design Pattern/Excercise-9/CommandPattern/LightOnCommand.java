public class LightOnCommand implements Command {
    private Light  obj;

    public LightOnCommand(Light  obj) {
        this.obj=obj;
    }
    @Override
    public void execute(){
        this.obj.lightsOn();
    }
    
}
