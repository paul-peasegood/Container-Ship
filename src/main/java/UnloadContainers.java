import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnloadContainers {



    public static void printContainers(Character[][] containers) {
        //print container arrangement
        for (int i = containers.length - 1; i > 0; i--) {
            for (int j = 0; j < containers[i].length; j++) {
                //print value containers[i][j] in changing null into " " and surround with brackets
                System.out.print("[" + (containers[i][j] == null ? " " : containers[i][j]) + "]");
            }
            System.out.println();
        }

    }

        /*
     Starting container arrangement

                    [A] [L]     [J]
                [B] [Q] [R]     [D] [T]
                [G] [H] [H] [M] [N] [E]
            [J] [L] [D] [L] [J] [H] [B]
        [Q] [L] [W] [S] [V] [N] [F] [N]
    [W] [N] [H] [M] [L] [B] [R] [T] [Q]
    [L] [O] [C] [W] [D] [J] [W] [Z] [E]
    [S] [J] [S] [T] [O] [M] [D] [!] [H]
     1   2   3   4   5   6   7   8   9

     */

    public static void main(String[] args) throws IOException {

        String instructions = System.getProperty("user.dir") + "/src/main/resources/data.txt";

        //create a 2D array of containers with the above arrangement
        Character[][] containers = {
                {'S','J','S','T','O','M', 'D','!', 'H'},
                {'L','O','C','W','D','J', 'W','Z', 'E'},
                {'W','N','H','M','L','B', 'R','T', 'Q'},
                {null, 'Q','L','W','S','V','N', 'F','N'},
                {null,null,'J','L','D','L','J', 'H','B'},
                {null,null,null,'G','H','H','M', 'N','E'},
                {null,null,null,'B','Q','R', null,'D','T'},
                {null,null,null,null,'A','L', null,'J',null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null},
                {null,null,null,null,null,null, null,null,null}

        };

        printContainers(containers);

        //loop over instructions var and print each line
        try (BufferedReader br = new BufferedReader(new FileReader(instructions))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                /*read each line and update container accordingly
                each create should be moved one at a time
                instructions come in the format move 5 from 4 to 5
                move is how many create to be moved,
                from is the column to be moved from,
                to is the column to be moved to
                 */
                String[] parts = line.split(" ");
                int move = Integer.parseInt(parts[1]);
                int from = Integer.parseInt(parts[3]) - 1;
                int to = Integer.parseInt(parts[5]) - 1;

                //loop over the number of create to be moved
                for (int i = 0; i < move; i++) {
                    //find the top create in the from column
                    int fromRow = 0;
                    for (int j = 0; j < containers.length; j++) {
                        if (containers[j][from] != null) {
                            fromRow = j;
                        }
                    }
                    Character character = containers[fromRow][from];
                    containers[fromRow][from] = null;
                    //find the top empty space in the to column
                    int toRow = -1;
                    for (int j = 0; j < containers.length; j++) {
                        if (containers[j][to] == null) {
                            toRow = j;
                            break;
                        }
                    }
                    containers[toRow][to] = character;
                    //if toRow is -1, then the column is full, print error and exit
                    if (toRow == -1) {
                        System.out.println("Error: column " + (to + 1) + " is full");
                        System.exit(1);
                    }
                }
                printContainers(containers);
            }
        }
    }
}
