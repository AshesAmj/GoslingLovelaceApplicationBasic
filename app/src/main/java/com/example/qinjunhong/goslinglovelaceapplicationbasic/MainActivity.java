package com.example.qinjunhong.goslinglovelaceapplicationbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String str="James Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                "\n" +
                "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[9] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[10] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]";
        String str2="Augusta Ada King-Noel, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a \"computing machine\" and the first computer programmer.[1][2][3]\n" +
                "\n" +
                "Ada Lovelace was the only legitimate child of the poet Lord Byron, and his wife Anne Isabella Milbanke (\"Annabella\"), Lady Wentworth.[4] All of Byron's other children were born out of wedlock to other women.[5] Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, \"Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart?\"[6]. He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada's interest in mathematics and logic in an effort to prevent her from developing her father's perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, and Ada in turn became Countess of Lovelace.";

        setContentView(R.layout.activity_main);
       // ((TextView)findViewById(R.id.textView5)).setText(str);
      //  ((TextView)findViewById(R.id.textView10)).setText(str2);


    }
}
