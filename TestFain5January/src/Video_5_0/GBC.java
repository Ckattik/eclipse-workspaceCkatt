package Video_5_0;

import java.awt.GridBagConstraints;
import java.awt.Insets;



public class GBC extends GridBagConstraints{

//	Создает обьект GBC, определяя gridx, gridy.
//	Значения остальных параметров принимаютьмя по умолчанию
//  @param gridx Позиция gridx
//  @param	gridy Позиция gridy
//  @param gridWidth Разширение ячейки в направлении x
//  @param gridHeght Разширение ячейки в направлении y

	public GBC(int gridx, int gridy) {
		this.gridx = gridx;
		this.gridy = gridy;
	}
	
//	Создаем обьект GBC, определяя gridx, gridy, gridWidth и gridHeigth.
//	Значения остальных параметров принимаються по умолчанию.
//	@param gridx Позиция gridx
//	@param gridy Позиция gridy	
//	@param gridWidth Разширение ячейки в направлении x
//	@param gridHeight Разширениме ячейки в направлении y

	public GBC(int gridx, int gridy, int gridWidth, int gridHeight) {
		
		this.gridx = gridx;
		this.gridy = gridy;
		this.gridwidth = gridWidth;
		this.gridheight = gridHeight;
		
	}
	
//	Устанавливаем параметр anchor.
//	@param anchor Значение параметра 
//	@return Обьект this, пригодный для дальнейшей модификации
	
	public GBC setAnchor(int anchor) {
		this.anchor = anchor;
		return this;
		
		
	}
	
//	Устанавливаем параметр fill.
//	@param fill Значение параметра 
//	@return Обьект this, пригодный для дальнейшей модификации
	
	public GBC setFill(int fill) {
		this.fill = fill;
		return this;
		
		
	}
	
//	Устанавливаем веса ячейки.
//	@param weightx Вес в направлении x
//	@param weigthy Вес в направлении y
//	@return Обьект this. Пригодний для дальнейшей модификации
	
	public GBC setWeight(double weightx, double weighty) {
		
		this.weightx = weightx;	
		this.weighty = weighty;
			return this;	
		}
		
//	Устанавливаем размеры свободного пространства для ячейки.
//	@param distance Размери по всем направлениям
//	@return Обьект this, пригодный для дальнейшей модификации

	
	public GBC setInsets(int distance) {
		this.insets = new Insets(distance, distance, distance, distance);
		return this;
	}
	

//	Устанавливаем размеры свободного пространства для ячейки.
//	@param top размер верхней части свободного пространства
//	@param left размер левой чпсти свободного пространства
//	@param bottom размер нижней части свободного пространства
//	@param right размер правой части свободного пространства
//	@return Обьект this, пригодный для дальнейшей модификации
	
	public GBC setInsets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}
	
	
//	Устанавливаем внутринее заполнение.
// @param ipadx Внутренее заполнение в направлении x
//	@param ipady Внутренее заполнение в направлении y
//	@return Обьект this, пригодный для дальнейшей модификации
	
	public GBC setIpad(int ipadx, int ipady) {
		this.ipadx = ipadx;
		this.ipady = ipady;
		return this;
	}

	
	
}
