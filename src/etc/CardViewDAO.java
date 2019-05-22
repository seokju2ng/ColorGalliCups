package etc;

import java.util.ArrayList;

import model.Card;
import model.CardDao;

public class CardViewDAO {
	private ArrayList<Card> cards;
	private CardDao cd = CardDao.getInstance();
	
	public CardViewDAO() {}
	public CardViewDAO(int cardNum) {
		cards =  cd.selectCards(cardNum);
//		for(int i = 0 ; i < cardNum ;i++) {
//			Card cv = new Card
//			cards.add(
//		}  //깊은 복사 안해도 되나?
		
	}
	public Card get(int index) {
		return cards.get(index);
	}
	public int size() {
		return cards.size();
	}
	public boolean isCorrect(StringBuffer userAns) {
		String str = new String(userAns);
		if(str.equals(cards.get(0))) {
			return true;
		}
		return false;
	}
	
	
}
