package UI.owner;

public class ViewController {
    private MainPageOwner mainPage;
    private Movements movements;
    private Profile profile;
    private Settings settings;

    public  ViewController(){

    }

    public MainPageOwner getMainPage() {
        return mainPage;
    }

    public void setMainPage(MainPageOwner mainPage) {
        this.mainPage = mainPage;
    }

    public Movements getMovements() {
        return movements;
    }

    public void setMovements(Movements movements) {
        this.movements = movements;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
