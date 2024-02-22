/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedtyping;

/**
 *
 * @author Server
 */
 class Player {

    private String name; 
    private int life;
    private int maxLife = 8;
    private int coin = 0;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter
    public int getMaxLife() {
        return maxLife;
    }

    // Setter
    public void setMaxLife(int newMaxLife) {
        this.maxLife = newMaxLife;
    }

    // Getter
    public int getLife() {
        return life;
    }

    // Setter
    public void setLife(int newLife) {
        this.life = newLife;
    }

    // Setter
    public void addLife() {
        this.life = life >= maxLife ? maxLife : life++;
    }

    // Setter
    public void removeLife() {
        this.life = life != 0 ? life-- : 0;
    }

    // Getter
    public int getCoin() {
        return coin;
    }

    // Setter
    public void setCoin(int newCoin) {
        this.coin = newCoin;
    }
}
