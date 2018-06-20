package section3;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "You are lost in a forest, and you must find your way back to your house using your sense of direction");
	String player= JOptionPane.showInputDialog("What will your name be?");
	JOptionPane.showMessageDialog(null, "Ok, " + player + ". You are roaming through the forest when you come across a split in the path you are following. You can either walk through thte forest (straight) or keep on the path you are on going either left or right.");
	int choice= JOptionPane.showOptionDialog(null, "Which way do you want to go?", "Choose", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Straight","Right","Left"}, null);
	if (choice==0) {
		int answer= JOptionPane.showConfirmDialog(null, "Are you sure?");
		if (answer==0) {
			JOptionPane.showMessageDialog(null, "I'm sorry, but that is not the way to your house. Please try again.");
		}
	}
	if (choice==1) {
		JOptionPane.showMessageDialog(null, "The sun is setting and you need to find shelter quickly. Will you keep going or stop to find a place to sleep?");
		int choice2= JOptionPane.showOptionDialog(null, "What do you want to do?", "Pick", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Keep Going","Stop"}, null);
	}
	if (choice==2) {
		JOptionPane.showMessageDialog(null, "The sun is setting and you need to find shelter quickly. Will you keep going or stop to find a place to sleep?");
		int choice2= JOptionPane.showOptionDialog(null, "What do you want to do?", "Pick", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Keep Going","Stop"}, null);
	}

}}
