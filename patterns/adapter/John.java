package patterns.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class John implements ITarget {
  private Map<String,String> englishFrenchMap = new HashMap<String,String>();
  private Map<String,String> frenchEnglishMap = new HashMap<String,String>();
  private David david = new David();
  private Rohit rohit = new Rohit();
  @Override
  public String translateAndTellToOtherPerson(String words, String convertToWhichLanguage) {
return null;
  }

  public String convertToEnglish(String words){
    return frenchEnglishMap.get(words);
  }

  public String convertToFrench(String words){
    return englishFrenchMap.get(words);
  }
}