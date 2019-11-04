public class Hero {

    private String name;
    
    private int level;

    /**
     * happy
     *
     * @param n
     * @param l
     */
    public Hero(String n, int l) {
        this.name = n;
        this.level = l;
    }

    /**
     * Me
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Don't wanna code
     *
     * @return
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Don't want to use vim
     */
    public void levelUp() {
        ++(this.level);
    }
}
