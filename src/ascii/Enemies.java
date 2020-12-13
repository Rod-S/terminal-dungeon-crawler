package ascii;

public class Enemies {

    public Object animation;

    public Enemies(int count) {
        this.animation = monster(count);
    }

    public static Object monster(int count) {
        if (count == 1) {
            String leftAlignFormat = "%-20s %-8s | %-1s | %-8s %n";
            System.out.format("                     ------   |                               (\\               /)                                 | ------   %n");
            System.out.format("                     ------   |                              __)\\             /(__                                | ------   %n");
            System.out.format("                     ------   |                             __)_ \\  (\\!~!/)  / _(__                               | ------   %n");
            System.out.format("                     ------   |                            __)_ `.\\  )d b(  /.' _(__                              | ------   %n");
            System.out.format("                     ------   |                          ___)_ `. \\\\(  _  )// .' _(___                            | ------   %n");
            System.out.format("                     ------   |                           )_  `. \\  ((q_p))  / .'  _(_                            | ------   %n");
            System.out.format("                     ------   |                           _)`.  \\  ,-)\\_/(-.  /  .'(_                             | ------   %n");
            System.out.format("                     ------   |                            _) ,-._/v/vvvvv\\v\\_,-. (_                              | ------   %n");
            System.out.format("                     ------   |                            _)///(._/v(___)v\\_.)\\\\\\(_                              | ------   %n");
            System.out.format("                     ------   |                             \\_ ___/v(_____)v\\___ _/                               | ------   %n");
            System.out.format("                     ------   |                               /vvv\\(_______)/vvv\\                                 | ------   %n");
            System.out.format("                     ------   |                               \\vvv/v(_____)v\\vvv/                                 | ------   %n");
            System.out.format("                     ------   |                               _\\vv\\\\v(___)v//vv/_                                 | ------   %n");
            System.out.format("                     ------   |                              '>_`  \\`-._.-'/  '_<`                                | ------   %n");
            System.out.format("                     ------   |                              ' >_,-'       `-._<`                                 | ------   %n");
        } else if (count == 0) {

            System.out.format("                     ------   |          _;~)                  (~;_                                      | ------   %n");
            System.out.format("                     ------   |        (   |                  |   )                                          | ------   %n");
            System.out.format("                     ------   |          ~', ',    ,''~'',   ,' ,'~                                        | ------   %n");
            System.out.format("                     ------   |              ', ','       ',' ,'                                                 | ------   %n");
            System.out.format("                     ------   |                ',: {'} {'} :,'                                               | ------   %n");
//        System.out.format("                     ------   |                  ;   /^\   ;                                           | ------   %n");
//        System.out.format("                     ------   |                   ~\  ~  /~                                          | ------   %n");
            System.out.format("                     ------   |                 ,' ,~~~~~, ',                                                     | ------   %n");
            System.out.format("                     ------   |               ,' ,' ;~~~; ', ',                                                   | ------   %n");
            System.out.format("                     ------   |             ,' ,'    '''    ', ',                                                 | ------   %n");
            System.out.format("                     ------   |           (~  ;               ;  ~)                                               | ------   %n");
            System.out.format("                     ------   |            -;_)               (_;-                                                | ------   %n");

        }
        return null;
    }

}
