package _chapter04;

import _chapter02.Money;
import _chapter02.discountcondition.DiscountCondition;
import java.util.List;
import javafx.util.Duration;

/**
 * @author : iyeong-gyo
 * @package : _chapter04
 * @since : 2022/03/10
 */
public class Movie {

  private String title;
  private Duration runningTime;
  private Money fee;
  private List<DiscountCondition> discountConditions;

  private MovieType movieType;
  private Money discountAmount;
  private Money discountPercent;
}
