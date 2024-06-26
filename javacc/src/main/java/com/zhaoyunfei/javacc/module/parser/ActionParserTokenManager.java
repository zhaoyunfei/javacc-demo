package com.zhaoyunfei.javacc.module.parser;/* Generated By:JavaCC: Do not edit this line. ActionParserTokenManager.java */
import com.zhaoyunfei.javacc.module.dto.ARCActionDto;
import com.zhaoyunfei.javacc.module.dto.CircleActionDto;
import com.zhaoyunfei.javacc.module.dto.LineActionDto;
import com.zhaoyunfei.javacc.module.dto.PTPActionDto;
import com.zhaoyunfei.javacc.module.service.IExecuteService;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

/** Token Manager. */
public class ActionParserTokenManager implements ActionParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xc03fbe00L) != 0L)
         {
            jjmatchedKind = 32;
            return 0;
         }
         return -1;
      case 1:
         if ((active0 & 0x8200L) != 0L)
            return 0;
         if ((active0 & 0xc03f3c00L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
            return 0;
         }
         return -1;
      case 2:
         if ((active0 & 0x1d0400L) != 0L)
            return 0;
         if ((active0 & 0xc0223800L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
            return 0;
         }
         return -1;
      case 3:
         if ((active0 & 0x40020000L) != 0L)
            return 0;
         if ((active0 & 0x80203800L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
            return 0;
         }
         return -1;
      case 4:
         if ((active0 & 0x80001800L) != 0L)
            return 0;
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
            return 0;
         }
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x200000L) != 0L)
            return 0;
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 32;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 6);
      case 41:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 8);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 60:
         return jjStopAtPos(0, 22);
      case 61:
         jjmatchedKind = 26;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 62:
         return jjStopAtPos(0, 24);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80000400L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x40020000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 8800:
         return jjStopAtPos(0, 29);
      case 8804:
         return jjStopAtPos(0, 23);
      case 8805:
         return jjStopAtPos(0, 25);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 58:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 61:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 102:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 0);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20800L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x280000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 0);
         return jjMoveStringLiteralDfa2_0(active0, 0x2400L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40001000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 67:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 0);
         break;
      case 80:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 0);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 100:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 0);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x21000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 0);
         break;
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 0);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 0);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 0);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x6000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 0);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 0);
         break;
      case 107:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 0);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 0);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x6000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000L);
      case 105:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 58:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000L);
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(11, 14);
         break;
      case 117:
         return jjMoveStringLiteralDfa12_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(12, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0xffffffffffffc000L, 0x7fffffffL, 0x0L
};
static final long[] jjbitVec2 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffL, 0x0L
};
private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 7;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 45)
                     jjCheckNAddTwoStates(2, 3);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(0);
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 46)
                     jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(5);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  kind = 32;
                  jjCheckNAdd(0);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(0);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 3, 4, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 159:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\50", "\51", "\54", "\151\146", 
"\146\157\162", "\167\150\151\154\145", "\142\162\145\141\153", 
"\147\157\164\157\40\143\157\156\164\151\156\165\145", "\72\72\143\157\156\164\151\156\165\145\72\72", "\144\157", "\145\156\144", 
"\164\150\145\156", "\120\124\120", "\114\151\156", "\101\122\103", "\103\151\162\143\154\145", 
"\74", "\u2264", "\76", "\u2265", "\75", "\75\75", "\53", "\u2260", 
"\164\162\165\145", "\146\141\154\163\145", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[7];
private final int[] jjstateSet = new int[14];
protected char curChar;
/** Constructor. */
public ActionParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ActionParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 7; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
