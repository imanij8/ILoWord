import tester.Tester;
import java.awt.Color;
import javalib.funworld.WorldScene;
import javalib.worldcanvas.WorldCanvas;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldImage;
import javalib.worldimages.FontStyle;



// to represents a list of words
interface ILoWord {

  // sorts lists in alphabetical order
  ILoWord sort();

  // helper for sort
  ILoWord insert(IWord that);

  // determines if list of IWords is in ABC order
  boolean isSorted();

  // helper for is sorted tells of a word comes before another
  boolean isSortedHelper(IWord word);

  // given two lists merges the 1st, 3rd & 5th elements 
  // of the first list and 2nd, 4th & 6th elements of the 2nd
  ILoWord interleave(ILoWord list2);

  // helper for interleave switches between 
  // interleave to weave 2 lists together
  ILoWord interweave(ILoWord list2);

  // given 2 sorted lists produces a combined sorted list of 
  // ALL elements in both lists
  ILoWord merge(ILoWord list2);

  // helper for merge 
  ILoWord mergeHelp(IWord word);

  // takes in a letter and removes the letter if 
  // its the first letter of a word
  ILoWord checkAndReduce(String letter);

  // helper for check and reduce that 
  // removes the first letter from the word
  IWord reduce(String letter);

  // helper for check and reduce that checks if
  // the letter input equals the first letter of the word
  boolean check(String letter);

  // adds an IWord to the end of an ILoWord
  ILoWord addToEnd(IWord word);

  // produces an ILoWord with any IWords
  // that have an empty string are filtered out
  ILoWord filterOutEmpties();

  // takes in a world scene and returns a world scene
  //of given ILoWord
  WorldScene draw(WorldScene scene);

  // places the image onto the world scene
  WorldScene drawHelp(WorldScene worldscene);

}

// represents an empty list of words
class MtLoWord implements ILoWord {

  /* Template
   * Methods
   * ... this.sort() ...                            -- ILoWord 
   * ... this.insert(IWord that)...                 -- ILoWord 
   * ... this.isSorted()...                         -- boolean 
   * ... isSortedHelper(IWord word)...              -- boolean 
   * ... this.isBefore(IWord word)...               -- boolean 
   * ... this.interleave()...                       -- ILoWord
   *  ... this.interweave(ILoWord list2)...         -- ILoWord
   *  ... this.merge()...                           -- ILoWord
   *  ... mergeHelp(IWord word) ...                 -- ILoWord
   *  ... this.checkAndReduce()...                  -- ILoWord 
   *  ... this.check(String letter)...              -- boolean
   *  ... this.reduce(String letter)...             -- IWord
   *  ... this.addToEnd...                          -- ILoWord 
   *  ... this.filterOutEmpties()...                -- ILoWord 
   *  ... this.draw()                               -- WorldScene
   *  ... this.drawHelp(WorldScene worldscene)...   -- WorldScene
   */

  //sorts lists in alphabetical order
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord sort() {
    return this;
  }

  //helper for sort
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord insert(IWord that) {
    return new ConsLoWord(that,this);
  }

  //determines if list of IWords is in ABC order
  //EVERYTHING IN CLASS TEMPLATE
  public boolean isSorted() {
    return true;

  }

  //helper for is sorted tells of a word comes before another
  //EVERYTHING IN CLASS TEMPLATE
  public boolean isSortedHelper(IWord word) {
    return true;
  }

  //given two lists merges the 1st, 3rd & 5th elements 
  // of the first list and 2nd, 4th & 6th elements of the 2nd
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord interleave(ILoWord list2) {
    return list2;
  }

  //helper for interleave switches between 
  // interleave to weave 2 lists together
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord interweave(ILoWord list2) {
    return list2;

  }

  //given 2 sorted lists produces a combined sorted list of 
  // ALL elements in both lists
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord merge(ILoWord list2) {
    return list2;
  }

  // helper for merge
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord mergeHelp(IWord word) {
    return new MtLoWord();
  }

  // takes in a letter and removes the letter if 
  // its the first letter of a word
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord checkAndReduce(String other) {
    return this;
  }

  //helper for check and reduce that 
  // removes the first letter from the word
  //EVERYTHING IN CLASS TEMPLATE
  public IWord reduce(String letter) {
    return new ActiveWord("error", 0,0);
  }

  //helper for check and reduce that checks if
  // the letter input equals the first letter of the word
  //EVERYTHING IN CLASS TEMPLATE
  public boolean check(String letter) {
    return false;
  }

  // adds an IWord to the end of an ILoWord
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord addToEnd(IWord word) {
    return new ConsLoWord(word, new MtLoWord());
  }

  //produces an ILoWord with any IWords
  // that have an empty string are filtered out
  //EVERYTHING IN CLASS TEMPLATE
  public ILoWord filterOutEmpties() {
    return this;
  }

  //takes in a world scene and returns a world scene
  //of given ILoWord
  //EVERYTHING IN CLASS TEMPLATE
  public WorldScene draw(WorldScene scene) {
    return scene;
  }

  // places the image onto worldscene
  //EVERYTHING IN CLASS TEMPLATE
  public WorldScene drawHelp(WorldScene worldscene) {
    return worldscene; 

  }
}

// represents a list of words
class ConsLoWord implements ILoWord {
  IWord first;
  ILoWord rest;

  ConsLoWord(IWord first, ILoWord rest) {
    this.first = first;
    this.rest = rest;
  }

  /* Template
   * Methods
   * ... this.sort() ...                            -- ILoWord 
   * ... this.insert(IWord that)...                 -- ILoWord 
   * ... this.isSorted()...                         -- boolean 
   * ... isSortedHelper(IWord word)...              -- boolean 
   * ... this.isBefore(IWord word)...               -- boolean 
   * ... this.interleave()...                       -- ILoWord
   *  ... this.interweave(ILoWord list2)...         -- ILoWord
   *  ... this.merge()...                           -- ILoWord
   *  ... mergeHelp(IWord word) ...                 -- ILoWord
   *  ... this.checkAndReduce()...                  -- ILoWord 
   *  ... this.check(String letter)...              -- boolean
   *  ... this.reduce(String letter)...             -- IWord
   *  ... this.addToEnd...                          -- ILoWord 
   *  ... this.filterOutEmpties()...                -- ILoWord 
   *  ... this.draw()                               -- WorldScene
   *  ... this.drawHelp(WorldScene worldscene)...   -- WorldScene
   */


  //sorts lists in alphabetical order
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord sort() {
    return this.rest.sort().insert(this.first);
  }

  //helper for sort
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord insert(IWord that) {
    if (this.first.wordBefore(that)) {
      return new ConsLoWord(this.first, this.rest.insert(that));
    }
    else {
      return new ConsLoWord(that,this);
    } 
  }

  //determines if list of IWords is in ABC order
  // EVERYTHING IN CLASS TEMPLATE
  public boolean isSorted() {
    return this.rest.isSortedHelper(this.first)
        && this.rest.isSorted();
  }

  //helper for is sorted tells of a word comes before another
  // EVERYTHING IN CLASS TEMPLATE
  public boolean isSortedHelper(IWord word) {
    return word.wordBefore(this.first);

  }

  //given two lists merges the 1st, 3rd & 5th elements 
  // of the first list and 2nd, 4th & 6th elements of the 2nd
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord interleave(ILoWord list2) {
    return new ConsLoWord(this.first, list2.interweave(this.rest));
  }

  //helper for interleave switches between 
  // interleave to weave 2 lists together
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord interweave(ILoWord list2) {
    return new ConsLoWord(this.first, list2.interleave(this.rest));
  }

  //given 2 sorted lists produces a combined sorted list of 
  // ALL elements in both lists
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord merge(ILoWord that) {
    return this.rest.merge(that.mergeHelp(this.first));

  }

  //helper for merge 
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord mergeHelp(IWord original) {
    if (this.first.wordBefore(original)) {
      return new ConsLoWord(this.first, this.rest.insert(original));
    }
    else {
      return new ConsLoWord(original,this);
    }
  }

  // takes in a letter and removes the letter if 
  // its the first letter of a word
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord checkAndReduce(String letter) {
    return new ConsLoWord(this.first.reduce(letter), this.rest.checkAndReduce(letter));
  }

  //helper for check and reduce that 
  // removes the first letter from the word
  // EVERYTHING IN CLASS TEMPLATE
  public IWord reduce(String letter) {
    return this.first;
  }

  // helper for check and reduce that checks if
  // the letter input equals the first letter of the word
  // EVERYTHING IN CLASS TEMPLATE
  public boolean check(String letter) {
    return false;
  }

  // adds an IWord to the end of an ILoWord
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord addToEnd(IWord word) {
    return new ConsLoWord(this.first, this.rest.addToEnd(word));
  }

  //produces an ILoWord with any IWords
  // that have an empty string are filtered out
  // EVERYTHING IN CLASS TEMPLATE
  public ILoWord filterOutEmpties() {
    if (this.first.isEmpty()) {
      return this.rest.filterOutEmpties();
    }
    else {
      return new ConsLoWord(this.first, this.rest.filterOutEmpties());
    }
  }

  //takes in a world scene and returns a world scene
  //of given ILoWord
  // EVERYTHING IN CLASS TEMPLATE
  public WorldScene draw(WorldScene scene) {
    return this.rest.draw(this.first.drawHelp(scene));
  }

  //places the image onto the world scene
  // EVERYTHING IN CLASS TEMPLATE
  public WorldScene drawHelp(WorldScene worldscene) {
    return worldscene.placeImageXY(this.first.makeImage(), 0, 0);

  }
}

// represents a word in the ZType game

interface IWord {

  // checks if other is before given word
  boolean wordBefore(IWord other);

  // checks string value to determine 
  // if a word comes before another
  boolean wordBeforeHelp(String original);

  // checks if the word is empty
  boolean isEmpty();

  // helper for check and reduce that checks if
  // the letter input equals the first letter of the word
  boolean check(String letter);

  //helper for check and reduce that 
  // removes the first letter from the word
  IWord reduce(String letter);

  // turns a text into an image
  WorldImage makeImage();

  // places an image on the given world scene
  WorldScene drawHelp(WorldScene worldscene);
}


// represents an active word in the ZType game

class ActiveWord implements IWord {
  String word;
  int x;
  int y;

  ActiveWord(String word, int x, int y) {
    this.word = word;
    this.x = x;
    this.y = y;
  }

  /* Template
   * Fields 
   * ...this.word...                               -- String 
   * ...this.x..                                   -- int 
   * ...this.y...                                  -- int 
   * Methods 
   * ... this.wordBefore(IWord other)...           -- boolean
   * ... this.wordBeforeHelp(String original)...   -- boolean
   * ... this.isEmpty()...                         -- boolean
   * ... this.check(String letter)...              -- Boolean
   * ... this.reduce(String letter)...             -- IWord 
   * ... this.makeImage()...                       -- WorldImage
   * ... this.drawHelp()...                        -- WorldScene
   */


  //helper for check and reduce that 
  // removes the first letter from the word
  // EVERYTHING IN CLASS TEMPLATE
  public IWord reduce(String letter) {
    if (this.check(letter)) {
      return new ActiveWord(this.word.substring(1), this.x, this.y);
    }
    else {
      return this;
    }
  }

  //helper for check and reduce that checks if
  // the letter input equals the first letter of the word
  // EVERYTHING IN CLASS TEMPLATE
  public boolean check(String letter) {
    return this.word.substring(0,1).equals(letter);
  }

  //checks whether the word becomes before for the sort method
  // EVERYTHING IN CLASS TEMPLATE
  public boolean wordBefore(IWord other) {
    return other.wordBeforeHelp(this.word);

  }

  //compares the given words in lowercase and alphabetically
  // EVERYTHING IN CLASS TEMPLATE
  public boolean wordBeforeHelp(String original) {
    return original.toLowerCase().compareTo(this.word.toLowerCase()) <= 0;
  }

  //checks if the word is empty
  // EVERYTHING IN CLASS TEMPLATE
  public boolean isEmpty() {
    return (this.word.equals("")); 
  }

  //places an image on the given world scene
  // EVERYTHING IN CLASS TEMPLATE
  public WorldScene drawHelp(WorldScene worldscene) {
    return worldscene.placeImageXY(this.makeImage(), this.x, this.y);
  }

  //turns a text into an image
  // EVERYTHING IN CLASS TEMPLATE
  public WorldImage makeImage() {
    return new TextImage(this.word,20, FontStyle.ITALIC, Color.MAGENTA);
  }
}



//represents an inactive word in the ZType game

class InactiveWord implements IWord {
  String word;
  int x;
  int y;


  InactiveWord(String word, int x, int y) {
    this.word = word;
    this.x = x;
    this.y = y;
  }

  /* Template
   * Fields 
   * ...this.word...                        -- String 
   * ...this.x..                            -- int 
   * ...this.y...                           -- int 
   * Methods
   * ... this.type() ...                    -- String
   * ... this.check(String letter)...       -- Boolean
   * ... this.reduce(String letter)...      -- IWord 
   * ... this.makeImage()...                -- WorldImage
   * ... this.drawHelp()...                 -- WorldScene
   */


  //helper for check and reduce that 
  // removes the first letter from the word
  // EVERYTHING IN CLASS TEMPLATE
  public IWord reduce(String letter) {
    return this;
  }

  //helper for check and reduce that checks if
  // the letter input equals the first letter of the word
  // EVERYTHING IN CLASS TEMPLATE
  public boolean check(String letter) {
    return false;
  } 

  // checks if a word comes before another
  // EVERYTHING IN CLASS TEMPLATE
  public boolean wordBefore(IWord other) {
    return other.wordBeforeHelp(this.word);
  }

  //compares the given words in lowercase and alphabetically
  // EVERYTHING IN CLASS TEMPLATE
  public boolean wordBeforeHelp(String original) {
    return original.toLowerCase().compareTo(this.word.toLowerCase()) <= 0;
  }

  //checks if the word is empty
  // EVERYTHING IN CLASS TEMPLATE
  public boolean isEmpty() {
    return (this.word.equals("")); 
  }

  //places an image on the given world scene
  // EVERYTHING IN CLASS TEMPLATE
  public WorldScene drawHelp(WorldScene worldscene) {
    return worldscene.placeImageXY(this.makeImage(), this.x, this.y);
  }

  //turns a text into an image
  // EVERYTHING IN CLASS TEMPLATE
  public WorldImage makeImage() {
    return new TextImage(this.word,20, FontStyle.BOLD_ITALIC, Color.PINK);
  }
}



//examples and tests for ILoWord
class ExamplesWordLists {
  // active words
  IWord active1 = new ActiveWord("direction", 99, 58);
  IWord active2 = new ActiveWord("shock", 17, 11);
  IWord active3 = new ActiveWord("sea", 20, 29);
  IWord active4 = new ActiveWord("ADVANCE", 62, 114);
  IWord active5 = new ActiveWord("Overcharge", 204, 17);
  IWord active6 = new ActiveWord("entry", 219, 136);
  IWord active7 = new ActiveWord("2024", 250, 111);
  IWord active8 = new ActiveWord("4202", 222, 111);

  //inactive words
  IWord inactive1 = new InactiveWord("SOURCE", 14,108);
  IWord inactive2 = new InactiveWord("Recognize", 215, 67);
  IWord inactive3 = new InactiveWord("analyst", 141, 24);
  IWord inactive4 = new InactiveWord("WIN", 67, 176);
  IWord inactive5 = new InactiveWord("knowledge", 258, 48);
  IWord inactive6 = new InactiveWord("Present", 37, 166);
  IWord inactive7 = new InactiveWord("6790", 146, 79);
  IWord inactive8 = new InactiveWord("1738", 265, 294);

  // lists of words
  ILoWord empty = new MtLoWord();
  // list of active
  ILoWord listA = new ConsLoWord(this.active1, this.empty); 
  // list of active
  ILoWord listAA = new ConsLoWord(this.active6, this.empty);
  ILoWord listBB = new ConsLoWord(this.active7, this.empty);
  //list of active and inactive
  ILoWord listB = new ConsLoWord(inactive6, this.listA); 
  //longer mix between active and inactive
  ILoWord listC = new ConsLoWord(this.active5, this.listB); 
  // longer active unsorted
  ILoWord listD = new ConsLoWord(this.active3,this.listA); 
  // active caps
  ILoWord listE = new ConsLoWord(this.active5, this.empty); 
  // only inactive
  ILoWord listF = new ConsLoWord(this.inactive5, this.empty); 
  // longer inactive
  ILoWord listG = new ConsLoWord(this.inactive1, this.listF);
  // longer active and sorted
  ILoWord listH = new ConsLoWord(this.active6, this.listD); 
  //all caps mixed
  ILoWord listI = new ConsLoWord(this.inactive4, 
      new ConsLoWord(this.active4, this.empty)); 

  ILoWord listJ = new ConsLoWord(this.active1, this.listA); 
  //inactive numbers unsorted
  ILoWord listK = new ConsLoWord(this.inactive8, 
      new ConsLoWord(this.inactive7, this.empty)); 
  // inactive unsorted
  ILoWord listL = new ConsLoWord(this.inactive2,
      new ConsLoWord(this.inactive4, this.empty));
  // made for sort
  ILoWord listM = new ConsLoWord(this.active8, this.listBB);
  //longer active caps
  ILoWord listN = new ConsLoWord(this.active4, this.listE); 
  // made for interleave
  ILoWord listO = new ConsLoWord(this.inactive1, this.empty);
  ILoWord listP = new ConsLoWord(this.inactive2, this.listO);
  // active nums
  ILoWord listQ = new ConsLoWord(this.active7,
      new ConsLoWord(this.active8,this.empty));
  // made for check and reduce
  ILoWord listR = new ConsLoWord(this.inactive1,
      new ConsLoWord(this.active2, new ConsLoWord(this.active3, this.empty)));
  // made for draw
  ILoWord listS = new ConsLoWord(this.inactive2,
      new ConsLoWord(this.active5, new ConsLoWord(this.active7,
          new ConsLoWord(this.inactive4, new ConsLoWord(this.inactive3, this.empty)))));
  // all active and inactive nums, made for draw
  ILoWord listT = new ConsLoWord(this.inactive7, new ConsLoWord(this.inactive8,
      new ConsLoWord(this.active7, new ConsLoWord(this.active8, this.empty))));
  // made for interleave and merge
  ILoWord listU = new MtLoWord();
  ILoWord listV = new MtLoWord();
  ILoWord listW = new ConsLoWord(this.active4, new ConsLoWord(this.active1, this.empty));


  // world scene examples
  WorldScene wse = new WorldScene(250,250);
  WorldScene ws1 = new WorldScene(250, 250)
      .placeImageXY(new TextImage("direction", 20, FontStyle.ITALIC, Color.MAGENTA), 99, 58);
  WorldScene ws2 = new WorldScene(250, 250)
      .placeImageXY(new TextImage("Present", 20, FontStyle.BOLD_ITALIC, Color.PINK), 37, 166)
      .placeImageXY(new TextImage("direction", 20, FontStyle.ITALIC, Color.MAGENTA), 99, 58);
  WorldScene ws3 = new WorldScene(250, 250)
      .placeImageXY(new TextImage("SOURCE", 20, FontStyle.BOLD_ITALIC, Color.PINK), 14, 108)
      .placeImageXY(new TextImage("Shock", 20, FontStyle.ITALIC, Color.MAGENTA), 17, 11)
      .placeImageXY(new TextImage("sea", 20, FontStyle.ITALIC, Color.MAGENTA), 20, 29);
  WorldScene ws4 = new WorldScene(250, 250)
      .placeImageXY(new TextImage("6790", 20, FontStyle.BOLD_ITALIC, Color.PINK), 146, 79)
      .placeImageXY(new TextImage("1738", 20, FontStyle.BOLD_ITALIC, Color.PINK), 265, 294)
      .placeImageXY(new TextImage("2024", 20, FontStyle.ITALIC, Color.MAGENTA), 250, 111)
      .placeImageXY(new TextImage("4202", 20, FontStyle.ITALIC, Color.MAGENTA), 222, 111);

  // tests for sort
  boolean testSort(Tester t) {
    // empty
    return t.checkExpect(empty.sort(), this.empty)
        // sorted
        && t.checkExpect(listA.sort(),this.listA) 
        // sorted
        && t.checkExpect(listE.sort(), this.listE)
        // inactive
        && t.checkExpect(listG.sort(), new ConsLoWord(new InactiveWord("knowledge", 258, 48), 
            new ConsLoWord(new InactiveWord("SOURCE", 14,108), new MtLoWord()))) 
        // active and inactive
        && t.checkExpect(listI.sort(), new ConsLoWord(new ActiveWord("ADVANCE", 62, 114), 
            new ConsLoWord(new InactiveWord("WIN", 67, 176), new MtLoWord()))) 
        // active, all numbers unsorted
        && t.checkExpect(listM.sort(), new ConsLoWord(new ActiveWord("2024", 250, 111),
            new ConsLoWord(new ActiveWord("4202", 222, 111), new MtLoWord()))) 
        // active unsorted
        && t.checkExpect(listH.sort(), new ConsLoWord(new ActiveWord("direction",99, 58), 
            new ConsLoWord(new ActiveWord("entry",219, 136), 
                new ConsLoWord(new ActiveWord("sea",20, 29), new MtLoWord()))))
        // inactive all numbers unsorted
        && t.checkExpect(listK.sort(), new ConsLoWord(new InactiveWord("1738",265, 294), 
            new ConsLoWord(new InactiveWord("6790",146, 79), new MtLoWord())));
  }

  // tests for isSorted
  boolean testIsSorted(Tester t) {
    // empty
    return t.checkExpect(empty.isSorted(), true)
        // one word
        && t.checkExpect(listA.isSorted(), true)  
        // active and inactive
        && t.checkExpect(listI.isSorted(), false) 
        //inactive
        && t.checkExpect(listG.isSorted(), false) 
        // nums
        && t.checkExpect(listM.isSorted(), false) 
        // all caps
        && t.checkExpect(listI.isSorted(), false); 
  }

  // tests for interleave
  boolean testInterleave(Tester t) {

    // empty
    return t.checkExpect(empty.interleave(listAA), this.listAA)
        //inactive words
        && t.checkExpect(listL.interleave(listG), new ConsLoWord(this.inactive2,
            new ConsLoWord(this.inactive1, new ConsLoWord(this.inactive4,
                new ConsLoWord(this.inactive5, new MtLoWord())))))
        // active words
        && t.checkExpect(listE.interleave(listD), new ConsLoWord(this.active5, 
            new ConsLoWord(this.active3, new ConsLoWord(this.active1,
                new MtLoWord()))))
        // caps active and inactive
        && t.checkExpect(listP.interleave(listI), new ConsLoWord(this.inactive2,
            new ConsLoWord(this.inactive4, new ConsLoWord(this.inactive1,
                new ConsLoWord(this.active4, new MtLoWord())))))
        // nums active and inactive
        && t.checkExpect(listK.interleave(listQ), new ConsLoWord(this.inactive8,
            new ConsLoWord(this.active7, new ConsLoWord(this.inactive7,
                new ConsLoWord(this.active8, new MtLoWord())))))
        // invoke empty takes in an empty
        && t.checkExpect(listU.interleave(listV), new MtLoWord())
        // invoke by non empty, take in empty
        && t.checkExpect(listA.interleave(listU), new ConsLoWord(this.active1, new MtLoWord()));
  }

  // tests for merge
  boolean testMerge(Tester t) {
    // empty
    return t.checkExpect(empty.merge(listA), this.listA)
        // inactive
        && t.checkExpect(listG.merge(listF), new ConsLoWord(this.inactive5,
            new ConsLoWord(this.inactive5, new ConsLoWord(this.inactive1, new MtLoWord()))))
        // active and inactive also has caps
        && t.checkExpect(listL.merge(listN), new ConsLoWord(this.active4, 
            new ConsLoWord(this.active5, new ConsLoWord(this.inactive2, 
                new ConsLoWord(this.inactive4, new MtLoWord())))))
        // nums active and inactive
        && t.checkExpect(listQ.merge(listK), new ConsLoWord(this.inactive8,
            new ConsLoWord(this.active7, new ConsLoWord(this.active8, 
                new ConsLoWord(this.inactive7, new MtLoWord())))))
        // active
        && t.checkExpect(listA.merge(listAA), new ConsLoWord(this.active1, 
            new ConsLoWord(this.active6, new MtLoWord())))
        // invoke empty, takes in empty
        && t.checkExpect(listU.merge(listV), new MtLoWord())
        //invoked by non empty, takes in an empty
        && t.checkExpect(listA.merge(empty), new MtLoWord())
        // non empty sorted 2 diff lengths
        && t.checkExpect(listAA.merge(listW), new ConsLoWord(this.active4, 
            new ConsLoWord(this.active1, new ConsLoWord(this.active6, new MtLoWord()))));
  }

  // tests for check and reduce
  boolean testcheckAndReduce(Tester t) {
    // empty
    return t.checkExpect(empty.checkAndReduce("j"), this.empty)
        // one word active
        && t.checkExpect(listA.checkAndReduce("d"),
            new ConsLoWord(new ActiveWord("irection", 99, 58), new MtLoWord()))
        // one word active no change
        && t.checkExpect(listA.checkAndReduce("p"), this.listA)
        // inactive
        && t.checkExpect(listG.checkAndReduce("k"), this.listG)
        // all words change
        && t.checkExpect(listR.checkAndReduce("s"),
            new ConsLoWord(this.inactive1,
                new ConsLoWord(new ActiveWord("hock",17,11), 
                    new ConsLoWord(new ActiveWord("ea", 20,29), new MtLoWord()))))
        // nothing change
        && t.checkExpect(listR.checkAndReduce("h"), this.listR)
        // numbers one change
        && t.checkExpect(listQ.checkAndReduce("2"), new ConsLoWord(new ActiveWord("024", 250,111),
            new ConsLoWord(this.active8,new MtLoWord())))
        // number one change
        && t.checkExpect(listQ.checkAndReduce("4"), new ConsLoWord(this.active7,
            new ConsLoWord(new ActiveWord("202",222,111), new MtLoWord())))
        // numbers nothing change
        && t.checkExpect(listK.checkAndReduce("3"), this.listK);

  }

  // tests for add to enter
  boolean testAddToEnd(Tester t) {
    // empty
    return t.checkExpect(this.empty.addToEnd(this.active1), new ConsLoWord(active1, new MtLoWord()))
        // active
        && t.checkExpect(this.listA.addToEnd(active4), new ConsLoWord(this.active1,
            new ConsLoWord(this.active4, new MtLoWord())))
        // inactive
        && t.checkExpect(this.listO.addToEnd(inactive5), new ConsLoWord(this.inactive1,
            new ConsLoWord(this.inactive5, new MtLoWord())))
        // active and inactive w/ caps
        && t.checkExpect(this.listI.addToEnd(inactive6), new ConsLoWord(this.inactive4,
            new ConsLoWord(this.active4, new ConsLoWord(this.inactive6, new MtLoWord()))))
        // nums active and inactive
        && t.checkExpect(this.listQ.addToEnd(inactive7), new ConsLoWord(this.active7,
            new ConsLoWord(this.active8, new ConsLoWord(this.inactive7, new MtLoWord()))));
  }

  // tests for filter out empties
  boolean testfilterOutEmpties(Tester t) {
    return t.checkExpect(this.listQ.filterOutEmpties(), new ConsLoWord(this.active7,
        new ConsLoWord(this.active8, new MtLoWord())))
        && t.checkExpect(this.listA.filterOutEmpties(), 
            new ConsLoWord(this.active1, new MtLoWord()))
        && t.checkExpect(this.listAA.filterOutEmpties(),
            new ConsLoWord(this.active6, new MtLoWord()))
        && t.checkExpect(this.listI.filterOutEmpties(), new ConsLoWord(this.inactive4,
            new ConsLoWord(this.active4, new MtLoWord())))
        && t.checkExpect(this.listU.filterOutEmpties(), new MtLoWord());
  }

  // tests for draw
  boolean testDraw(Tester t) {
    // empty 
    return t.checkExpect(this.empty.draw(wse), this.wse)
        && t.checkExpect(this.listA.draw(wse),this.ws1)
        && t.checkExpect(this.listB.draw(wse), this.ws2)
        && t.checkExpect(this.listR.draw(wse),this.ws3)
        && t.checkExpect(this.listT.draw(wse), this.ws4);

  }

  boolean testDrawWords(Tester t) {
    WorldCanvas c1 = new WorldCanvas(500, 500);
    WorldScene s1 = new WorldScene(250, 250)
        .placeImageXY(new RectangleImage(500, 500, "solid", Color.BLACK), 250, 250);
    return c1.drawScene(listA.draw(s1)) && c1.show();
  }
}
