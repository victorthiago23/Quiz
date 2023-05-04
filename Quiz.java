import javax.swing.*;

class Quiz{

    public static void main(String[] args) {
    
        String msg1 = "", msgf = "sua pontuação final foi ", msg2 = "", msg3 = "", msg4 = "", msg5 = "", msg6 = "", msg7 = "", msg8 = "", msg9 = "", msg10 = "";
        int n1, r1, n2, n3, n4, n5, n6, n7, n8, n9, n10, resultado;

        JOptionPane.showMessageDialog(null, "Quiz sobre futebol!");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 1:\nQual é o time com a maior quantidade de campeonatos brasileiros na história?\n1 - Corinthians\n2 - Palmeiras\n3 - São Paulo\n4 - Santos\n5 - Flamengo"));

        switch (n1) {
            case 1:
            {
                    msg1 = msg1 + "Pergunta 1 - Resposta errada!\nO certo é 2 - Palmeiras!\n";
                    n1 = 0;
                break;
            }
            case 2: 
            {
                msg1 = msg1 + "Pergunta 1 - Resposta correta!\n";
                n1 = 1;
                break;
            }
            case 3:
            {
                    msg1 = msg1 + "Pergunta 1 - Resposta errada!\nO certo é 2 - Palmeiras!\n";
                    n1 = 0;
                break;
            }
            case 4:
            {
                    msg1 = msg1 + "Pergunta 1 - Resposta errada!\nO certo é 2 - Palmeiras!\n";
                    n1 = 0;
                break;
            }
            case 5:
            {
                    msg1 = msg1 + "Pergunta 1 - Resposta errada!\nO certo é 2 - Palmeiras!\n";
                    n1 = 0;
                break;
            }
            default: n1 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n1 >=0){
            JOptionPane.showMessageDialog(null, msg1);
        }

        n2 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 2:\nQual é o time com a maior quantidade de champions league na história?\n1 - Milan\n2 - Liverpool\n3 - Barcelona\n4 - Real Madrid\n5 - Bayer Munich"));

        switch (n2) {
            case 1:
            {
                    msg2 = msg2 + "Pergunta 2 - Resposta errada!\nO certo é 4 - Real Madrid!\n";
                    n2 = 0;
                break;
            }
            case 2: 
            {
                msg2 = msg2 + "Pergunta 2 - Resposta errada!\nO certo é 4 - Real Madrid!\n";
                n2 = 0;
                break;
            }
            case 3:
            {
                    msg2 = msg2 + "Pergunta 2 - Resposta errada!\nO certo é 4 - Real Madrid!\n";
                    n2 = 0;
                break;
            }
            case 4:
            {
                    msg2 = msg2 + "Pergunta 2 - Resposta correta!\n";
                    n2 = 1;
                break;
            }
            case 5:
            {
                    msg2 = msg2 + "Pergunta 2 - Resposta errada!\nO certo é 4 - Real Madrid!\n";
                    n2 = 0;
                break;
            }
            default: n2 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n2 >=0){
            JOptionPane.showMessageDialog(null, msg2);
        }

        n3 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 3:\nQual é a seleção com a maior quantidade de títulos de copa do mundo na história?\n1 - Brasil\n2 - Argentina\n3 - França\n4 - Alemanha\n5 - Itália"));

        switch (n3) {
            case 1:
            {
                    msg3 = msg3 + "Pergunta 3 - Resposta correta!\n";
                    n3 = 1;
                break;
            }
            case 2: 
            {
                msg3 = msg3 + "Pergunta 3 - Resposta errada!\nO certo é 1 - Brasil!\n\n";
                n3 = 0;
                break;
            }
            case 3:
            {
                    msg3 = msg3 + "Pergunta 3 - Resposta errada!\nO certo é 1 - Brasil!\n\n";
                    n3 = 0;
                break;
            }
            case 4:
            {
                    msg3 = msg3 + "Pergunta 3 - Resposta errada!\nO certo é 1 - Brasil!\n\n";
                    n3 = 0;
                break;
            }
            case 5:
            {
                    msg3 = msg3 + "Pergunta 3 - Resposta errada!\nO certo é 1 - Brasil!\n";
                    n3 = 0;
                break;
            }
            default: n3 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n3 >=0){
            JOptionPane.showMessageDialog(null, msg3);
        }

        n4 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 4:\nQuem é o maior artilheiro da história da champions league?\n1 - Cristiano Ronaldo\n2 - Neymar\n3 - Benzema\n4 - Messi\n5 - Haaland"));

        switch (n4) {
            case 1:
            {
                    msg4 = msg4 + "Pergunta 4 - Resposta correta!\n";
                    n4 = 1;
                break;
            }
            case 2: 
            {
                msg4 = msg4 + "Pergunta 4 - Resposta errada!\nO certo é 1 - Cristiano Ronaldo!\n\n";
                n4 = 0;
                break;
            }
            case 3:
            {
                    msg4 = msg4 + "Pergunta 4 - Resposta errada!\nO certo é 1 - Cristiano Ronaldo!\n\n";
                    n4 = 0;
                break;
            }
            case 4:
            {
                    msg4 = msg4 + "Pergunta 4 - Resposta errada!\nO certo é 1 - Cristiano Ronaldo!\n\n";
                    n4 = 0;
                break;
            }
            case 5:
            {
                    msg4 = msg4 + "Pergunta 4 - Resposta errada!\nO certo é 1 - Cristiano Ronaldo!\n";
                    n4 = 0;
                break;
            }
            default: n4 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n4 >=0){
            JOptionPane.showMessageDialog(null, msg4);
        }

        n5 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 5:\nQuanto foi o placar da final da copa do mundo de 2022?\n1 - França 0 X 0 Argentina\n2 - França 1 X 1 Argentina\n3 - França 2 X 2 Argentina\n4 - França 3 X 3 Argentina\n5 - França 4 X 4 Argentina"));

        switch (n5) {
            case 1:
            {
                    msg5 = msg5 + "Pergunta 5 - Resposta errada!\nO certo é 3 - França 3 X 3 Argentina!!\n";
                    n5 = 0;
                break;
            }
            case 2: 
            {
                msg5 = msg5 + "Pergunta 5 - Resposta errada!\nO certo é 3 - França 3 X 3 Argentina!\n\n";
                n5 = 0;
                break;
            }
            case 3:
            {
                    msg5 = msg5 + "Pergunta 5 - Resposta errada!\nO certo é 3 - França 3 X 3 Argentina!!\n\n";
                    n5 = 0;
                break;
            }
            case 4:
            {
                    msg5 = msg5 + "Pergunta 5 - Resposta correta!\n\n";
                    n5 = 1;
                break;
            }
            case 5:
            {
                    msg5 = msg5 + "Pergunta 5 - Resposta errada!\nO certo é 3 - França 3 X 3 Argentina!!\n";
                    n5 = 0;
                break;
            }
            default: n5 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n5 >=0){
            JOptionPane.showMessageDialog(null, msg5);
        }

        n6 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 6:\nQual destes times a seguir já foi rebaixado?\n1 - Real Madrid\n2 - Juventus\n3 - Barcelona\n4 - Boca Juniors\n5 - Inter de Milão"));

        switch (n6) {
            case 1:
            {
                    msg6 = msg6 + "Pergunta 6 - Resposta errada!\nO certo é 2 - Juventus!\n";
                    n6 = 0;
                break;
            }
            case 2: 
            {
                msg6 = msg6 + "Pergunta 6 - Resposta correta!\n";
                n6 = 1;
                break;
            }
            case 3:
            {
                    msg6 = msg6 + "Pergunta 6 - Resposta errada!\nO certo é 2 - Juventus!\n";
                    n6 = 0;
                break;
            }
            case 4:
            {
                    msg6 = msg6 + "Pergunta 6 - Resposta errada!\nO certo é 2 - Juventus!\n";
                    n6 = 0;
                break;
            }
            case 5:
            {
                    msg6 = msg6 + "Pergunta 6 - Resposta errada!\nO certo é 2 - Juventus!\n";
                    n6 = 0;
                break;
            }
            default: n6 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n6 >=0){
            JOptionPane.showMessageDialog(null, msg6);
        }

        n7 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 7:\nQual destes times a seguir nunca foi rebaixado?\n1 - Liverpool\n2 - Milan\n3 - Cuiabá\n4 - River Plate\n5 - Bayer Munich"));

        switch (n7) {
            case 1:
            {
                    msg7 = msg7 + "Pergunta 7 - Resposta errada!\nO certo é 3 - Cuiabá!\n";
                    n7 = 0;
                break;
            }
            case 2: 
            {
                msg7 = msg7 + "Pergunta 7 - Resposta errada!\nO certo é 3 - Cuiabá!\n";
                n7 = 0;
                break;
            }
            case 3:
            {
                    msg7 = msg7 + "Pergunta 7 - Resposta correta!\n";
                    n7 = 1;
                break;
            }
            case 4:
            {
                    msg7 = msg7 + "Pergunta 7 - Resposta errada!\nO certo é 3 - Cuiabá!\n";
                    n7 = 0;
                break;
            }
            case 5:
            {
                    msg7 = msg7 + "Pergunta 7 - Resposta errada!\nO certo é 3 - Cuiabá!\n";
                    n7 = 0;
                break;
            }
            default: n7 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n7 >=0){
            JOptionPane.showMessageDialog(null, msg7);
        }

        n8 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 8:\nQual destes times a seguir nunca foi campeão paulista?\n1 - São Caetano\n2 - Ponte Preta\n3 - Ituano\n4 - RB Bragantino\n5 - Inter de Limeira"));

        switch (n8) {
            case 1:
            {
                    msg8 = msg8 + "Pergunta 8 - Resposta errada!\nO certo é 2 - Ponte Preta!\n";
                    n8 = 0;
                break;
            }
            case 2: 
            {
                msg8 = msg8 + "Pergunta 8 - Resposta correta!\n";
                n8 = 1;
                break;
            }
            case 3:
            {
                    msg8 = msg8 + "Pergunta 8 - Resposta errada!\nO certo é 2 - Ponte Preta!\n";
                    n8 = 0;
                break;
            }
            case 4:
            {
                    msg8 = msg8 + "Pergunta 8 - Resposta errada!\nO certo é 2 - Ponte Preta!\n";
                    n8 = 0;
                break;
            }
            case 5:
            {
                    msg8 = msg8 + "Pergunta 8 - Resposta errada!\nO certo é 2 - Ponte Preta!\n";
                    n8 = 0;
                break;
            }
            default: n8 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n8 >=0){
            JOptionPane.showMessageDialog(null, msg8);
        }

        n9 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 9:\nQual destes times a seguir nunca foi campeão da champions?\n1 - Notthingham Forest\n2 - Hamburgo\n3 - PSV\n4 - Sevilla\n5 - Celtic"));

        switch (n9) {
            case 1:
            {
                    msg9 = msg9 + "Pergunta 9 - Resposta errada!\nO certo é 4 - Sevilla!\n";
                    n9 = 0;
                break;
            }
            case 2: 
            {
                msg9 = msg9 + "Pergunta 9 - Resposta errada!\nO certo é 4 - Sevilla!\n";
                n9 = 0;
                break;
            }
            case 3:
            {
                    msg9 = msg9 + "Pergunta 9- Resposta errada!\nO certo é 4 - Sevilla!\n";
                    n9 = 0;
                break;
            }
            case 4:
            {
                    msg9 = msg9 + "Pergunta 9 - Resposta correta!\n";
                    n9 = 1;
                break;
            }
            case 5:
            {
                    msg9 = msg9 + "Pergunta 9 - Resposta errada!\nO certo é 4 - Sevilla!\n";
                    n9 = 0;
                break;
            }
            default: n9 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n9 >=0){
            JOptionPane.showMessageDialog(null, msg9);
        }

        n10 = Integer.parseInt(JOptionPane.showInputDialog("Pergunta número 10:\nQual destes times a seguir nunca foi campeão brasileiro?\n1 - Guarani\n2 - Coritiba\n3 - Sport\n4 - Bahia\n5 - RB Bragantino"));

        switch (n10) {
            case 1:
            {
                    msg10 = msg10 + "Pergunta 10 - Resposta errada!\nO certo é 5 - RB Bragantino!\n";
                    n10 = 0;
                break;
            }
            case 2: 
            {
                msg10 = msg10 + "Pergunta 10 - Resposta errada!\nO certo é 5 - RB Bragantino!\n";
                n10 = 0;
                break;
            }
            case 3:
            {
                    msg10 = msg10 + "Pergunta 10 - Resposta errada!\nO certo é 5 - RB Bragantino!\n";
                    n10 = 0;
                break;
            }
            case 4:
            {
                    msg10 = msg10 + "Pergunta 10 - Resposta errada!\nO certo é 5 - RB Bragantino!\n";
                    n10 = 0;
                break;
            }
            case 5:
            {
                    msg10 = msg10 + "Pergunta 10 - Resposta correta!\n";
                    n10 = 1;
                break;
            }
            default: n10 = 0;JOptionPane.showMessageDialog(null, "Opção inválida, resposta não computada.");
        }
        if (n10 >=0){
            JOptionPane.showMessageDialog(null, msg10);
        }


        resultado = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        
            if (resultado >=8) {
                JOptionPane.showMessageDialog(null, "Parabéns, " + msgf + resultado + "/10!!! Você manja muito de futebol!!!");  
            }

            if (resultado >=5 && resultado <=7) {
                JOptionPane.showMessageDialog(null, "É isso aí, " + msgf + resultado + "/10!!! Você manja de futebol, falta pouco pra ser um boleiro completo!");
            }

            if (resultado >=1 && resultado <=4) {
                JOptionPane.showMessageDialog(null, "Humm, " + msgf + resultado + "/10!!! Você não é muito fã de futebol certo?");  
            }

            if (resultado == 0) {
                JOptionPane.showMessageDialog(null, "A " + msgf + resultado + "/10!!! Esse quiz não é pra você...");  
            }
        
        System.exit(0);
    }
}