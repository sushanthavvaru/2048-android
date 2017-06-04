package com.example.sushanth.play2048;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by sushanth on 5/8/2017.
 */

public class Box {
    static Paint twoBoxColor, fourBoxColor, eightBoxColor,sixteenBoxColor, thirtytwoBoxColor, sixtyfourBoxColor, onetwentyeightBoxColor,
            twofiftysixBoxColor, fivetwelveBoxColor,
            thousandtwentyfourBoxColor,twoZeroFourEightBoxColor,
            fourDigitTextColor, useThisColorForBox,useThisColorForText, twoFourTextColor,eightSixteenTextColor,threeDigitTextColor;
    static {
        twoBoxColor=new Paint();
        twoBoxColor.setColor(Color.rgb(249,249,210));
        twoBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        fourBoxColor=new Paint();
        fourBoxColor.setColor(Color.rgb(239,239,167));
        fourBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        eightBoxColor=new Paint();
        eightBoxColor.setColor(Color.rgb(247,176,82));
        eightBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        sixteenBoxColor=new Paint();
        sixteenBoxColor.setColor(Color.rgb(230,151,31));
        sixteenBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        thirtytwoBoxColor=new Paint();
        thirtytwoBoxColor.setColor(Color.rgb(255,140,82));
        thirtytwoBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        sixtyfourBoxColor = new Paint();
        sixtyfourBoxColor.setColor(Color.rgb(243,85,5));
        sixtyfourBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        onetwentyeightBoxColor = new Paint();
        onetwentyeightBoxColor.setColor(Color.rgb(240,243,132));
        onetwentyeightBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        twofiftysixBoxColor = new Paint();
        twofiftysixBoxColor.setColor(Color.rgb(242,246,118));
        twofiftysixBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        fivetwelveBoxColor = new Paint();
        fivetwelveBoxColor.setColor(Color.rgb(248,255,23));
        fivetwelveBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        thousandtwentyfourBoxColor = new Paint();
        thousandtwentyfourBoxColor.setColor(Color.rgb(150,255,150));
        thousandtwentyfourBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        twoZeroFourEightBoxColor = new Paint();
        twoZeroFourEightBoxColor.setColor(Color.rgb(0,255,0));
        twoZeroFourEightBoxColor.setStyle(Paint.Style.FILL_AND_STROKE);

        twoFourTextColor = new Paint();
        twoFourTextColor.setColor(Color.rgb(92,92,66));
        twoFourTextColor.setStyle(Paint.Style.STROKE);
        twoFourTextColor.setTextSize(100);
        twoFourTextColor.setTypeface(Typeface.create("",Typeface.BOLD));

        eightSixteenTextColor = new Paint();
        eightSixteenTextColor.setColor(Color.rgb(255,255,255));
        eightSixteenTextColor.setStyle(Paint.Style.STROKE);
        eightSixteenTextColor.setTextSize(100);
        eightSixteenTextColor.setTypeface(Typeface.create("",Typeface.BOLD));

        threeDigitTextColor = new Paint();
        threeDigitTextColor.setColor(Color.rgb(255,255,255));
        threeDigitTextColor.setStyle(Paint.Style.STROKE);
        threeDigitTextColor.setTextSize(70);
        threeDigitTextColor.setTypeface(Typeface.create("",Typeface.BOLD));

        fourDigitTextColor = new Paint();
        fourDigitTextColor.setColor(Color.rgb(255,255,255));
        fourDigitTextColor.setStyle(Paint.Style.STROKE);
        fourDigitTextColor.setTextSize(60);
        fourDigitTextColor.setTypeface(Typeface.create("",Typeface.BOLD));

    }
    float firstRowTop, firstRowBottom, secondRowTop, secondRowBottom,thirdRowTop, thirdRowBottom, fourthRowTop,fourthRowBottom ;
    float firstCoulumnLeft, firstColumnRight, secondColumnLeft, secondColumnRight, thirdColumnLeft, thirdColumnRight, fourthColumnLeft, fourthColumnRight;
    int row;
    int column;
    int number;
    String textimage;
    public Box(int row, int column, int number){
        this.row=row;
        this.column=column;
        this.number=number;
    }


    public void drawOn(Canvas canvas) {
        int screenWidth = canvas.getWidth();
        int screenHeight = canvas.getHeight();
        float drawRowTop=0, drawRowBottom=0, drawColumnLeft=0, drawColumnRight=0;
        firstRowTop = 0 + Double.valueOf(0.1 * (screenWidth / 4)).floatValue();
        firstRowBottom = screenHeight / 4 - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        secondRowTop = screenHeight / 4 + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        secondRowBottom = 2*screenHeight / 4 - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        thirdRowTop= 2*screenHeight / 4 + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        thirdRowBottom= 3*screenHeight / 4 - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        fourthRowTop= 3*screenHeight / 4 + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        fourthRowBottom= 4*screenHeight / 4 - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        firstCoulumnLeft=0 + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        firstColumnRight=screenWidth / 4 - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        secondColumnLeft= 1 * (screenHeight / 4) + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        secondColumnRight= 2 * (screenHeight / 4) - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        thirdColumnLeft= 2 * (screenHeight / 4) + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        thirdColumnRight= 3 * (screenHeight / 4) - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        fourthColumnLeft= 3 * (screenHeight / 4) + Double.valueOf(0.1 * (screenHeight / 4)).floatValue();
        fourthColumnRight= 4* screenHeight / 4 - Double.valueOf(0.1 * (screenHeight / 4)).floatValue();

        switch (row){
            case 0:
                drawRowTop=firstRowTop;
                drawRowBottom = firstRowBottom;
                break;
            case 1:
                drawRowTop=secondRowTop;
                drawRowBottom = secondRowBottom;
                break;
            case 2:
                drawRowTop=thirdRowTop;
                drawRowBottom = thirdRowBottom;
                break;
            case 3:
                drawRowTop=fourthRowTop;
                drawRowBottom = fourthRowBottom;
                break;
        }
        switch (column){
            case 0:
                drawColumnLeft=firstCoulumnLeft;
                drawColumnRight = firstColumnRight;
                break;
            case 1:
                drawColumnLeft=secondColumnLeft;
                drawColumnRight = secondColumnRight;
                break;
            case 2:
                drawColumnLeft=thirdColumnLeft;
                drawColumnRight = thirdColumnRight;
                break;
            case 3:
                drawColumnLeft=fourthColumnLeft;
                drawColumnRight = fourthColumnRight;
                break;
        }
        switch (number){
            case 2:
                useThisColorForBox= twoBoxColor;
                useThisColorForText = twoFourTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-30,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 4:
                useThisColorForBox=fourBoxColor;
                useThisColorForText = twoFourTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-30,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 8:
                useThisColorForBox = eightBoxColor ;
                useThisColorForText = eightSixteenTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-30,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;

            case 16:
                useThisColorForBox = sixteenBoxColor ;
                useThisColorForText = eightSixteenTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-60,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 32:
                useThisColorForBox = thirtytwoBoxColor ;
                useThisColorForText = eightSixteenTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-60,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 64:
                useThisColorForBox = sixtyfourBoxColor ;
                useThisColorForText = eightSixteenTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-60,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 128:
                useThisColorForBox = onetwentyeightBoxColor ;
                useThisColorForText = threeDigitTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-60,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 256:
                useThisColorForBox = twofiftysixBoxColor ;
                useThisColorForText = threeDigitTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-60,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 512:
                useThisColorForBox = fivetwelveBoxColor ;
                useThisColorForText = threeDigitTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-60,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);
                break;
            case 1024:
                useThisColorForBox = thousandtwentyfourBoxColor ;
                useThisColorForText = fourDigitTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-68,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);break;
            case 2048:
                useThisColorForBox = twoZeroFourEightBoxColor ;
                useThisColorForText = fourDigitTextColor;
                textimage = Integer.toString(number);
                canvas.drawRect(drawColumnLeft,drawRowTop,drawColumnRight,drawRowBottom,useThisColorForBox);
                canvas.drawText(textimage, (drawColumnLeft+drawColumnRight)/2-68,(drawRowBottom+drawRowTop)/2+35, useThisColorForText);break;
        }

    }


}
