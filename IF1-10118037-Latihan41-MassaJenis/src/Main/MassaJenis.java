/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 */
public class MassaJenis {

	private int sisi;
	private int massa;

	public int getSisi() {
		return this.sisi;
	}

	/**
	 * 
	 * @param sisi
	 */
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}

	public int getMassa() {
		return this.massa;
	}

	/**
	 * 
	 * @param massa
	 */
	public void setMassa(int massa) {
		this.massa = massa;
	}

	/**
	 * 
	 * @param parSisi
	 */
	public int hitungVolume(int parSisi) {
		
		return (int) Math.pow(parSisi, 3);
	}

	/**
	 * 
	 * @param parMassa
	 * @param volume
     * @return 
	 */
	public int hitungMassaJenis(int parMassa, int volume) {
                               
                                 
            
                                return parMassa / volume;
	}
    
}
