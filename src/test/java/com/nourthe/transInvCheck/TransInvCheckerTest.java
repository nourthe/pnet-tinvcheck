package com.nourthe.transInvCheck;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.nourthe.transInvCheck.TransInvChecker.checkTransitions;
import static org.junit.Assert.assertEquals;

public class TransInvCheckerTest {

    @Test
    public void test1checkTransitions() {
    }

    @Test
    public void test2CheckTransitions() {
        List<TInvariant<mTransitions>> mInvs = new ArrayList<>();
        fillInvariants(mInvs);
        List<mTransitions> mSeq;
        List<mTransitions> result;

        mSeq = new ArrayList<>();
        fillCorrectLongSequence(mSeq);
        result = checkTransitions(mInvs, mSeq);
        assertEquals(0, result.size());

        mSeq = new ArrayList<>();
        mockFill1(mSeq);
        result = checkTransitions(mInvs, mSeq);
        assertEquals(0, result.size());

        mSeq = new ArrayList<>();
        fillIncorrectLongSequence(mSeq);
        result = checkTransitions(mInvs, mSeq);
        assertEquals(2, result.size());
    }


    public enum mTransitions{
        T0, T1, T2, T3, T4, T5, T6
    }

    public void fillInvariants(List<TInvariant<mTransitions>> list){
        TInvariant<mTransitions> inv1 = new TInvariant<>();
        inv1.addAll(Arrays.asList(mTransitions.T0, mTransitions.T1, mTransitions.T2, mTransitions.T3));

        TInvariant<mTransitions> inv2 = new TInvariant<>();
        inv2.addAll(Arrays.asList(mTransitions.T0, mTransitions.T1, mTransitions.T6));

        TInvariant<mTransitions> inv3 = new TInvariant<>();
        inv3.addAll(Arrays.asList(mTransitions.T0, mTransitions.T4, mTransitions.T5));

        list.addAll(Arrays.asList(inv1, inv2, inv3));
    }


    private static void mockFill1(List<mTransitions> list){
        list.add(mTransitions.T0); list.add(mTransitions.T1); list.add(mTransitions.T0);
        list.add(mTransitions.T2); list.add(mTransitions.T1); list.add(mTransitions.T0);
        list.add(mTransitions.T2); list.add(mTransitions.T1); list.add(mTransitions.T3);
        list.add(mTransitions.T6); list.add(mTransitions.T3);
    }

    private static void mockFill2(List<mTransitions> list){
        list.add(mTransitions.T0); list.add(mTransitions.T1); list.add(mTransitions.T2);
        list.add(mTransitions.T0); list.add(mTransitions.T1); list.add(mTransitions.T6);
        list.add(mTransitions.T3);
    }

    private static void mockFill3(List<mTransitions> list){
        list.add(mTransitions.T0); list.add(mTransitions.T1);
        list.add(mTransitions.T2); list.add(mTransitions.T3);
    }

    private void fillCorrectLongSequence(List<mTransitions> list){
        list.addAll(Arrays.asList(
                mTransitions.T0, mTransitions.T4, mTransitions.T0, mTransitions.T5,
                mTransitions.T0, mTransitions.T4, mTransitions.T1, mTransitions.T5,
                mTransitions.T0, mTransitions.T2, mTransitions.T3, mTransitions.T1,
                mTransitions.T0, mTransitions.T2, mTransitions.T0, mTransitions.T0,
                mTransitions.T1, mTransitions.T6, mTransitions.T0, mTransitions.T3,
                mTransitions.T1, mTransitions.T0, mTransitions.T4, mTransitions.T1,
                mTransitions.T2, mTransitions.T3, mTransitions.T1, mTransitions.T2,
                mTransitions.T6, mTransitions.T5, mTransitions.T3
        ));
    }

    private void fillIncorrectLongSequence(List<mTransitions> list){
        list.addAll(Arrays.asList(
                mTransitions.T0, mTransitions.T4, mTransitions.T0, mTransitions.T5,
                mTransitions.T0, mTransitions.T4, mTransitions.T1, mTransitions.T5,
                mTransitions.T0, mTransitions.T2, mTransitions.T3, mTransitions.T1, mTransitions.T4, mTransitions.T1,
                mTransitions.T0, mTransitions.T2, mTransitions.T0, mTransitions.T0,
                mTransitions.T1, mTransitions.T6, mTransitions.T0, mTransitions.T3,
                mTransitions.T1, mTransitions.T0, mTransitions.T4, mTransitions.T1,
                mTransitions.T2, mTransitions.T3, mTransitions.T1, mTransitions.T2,
                mTransitions.T6, mTransitions.T5, mTransitions.T3
        ));
    }

    private void fillCorrectVeryLongSequence(List<mTransitions> list){
        for(int i = 0; i < 6000; i++){
            fillCorrectLongSequence(list);
        }
    }


}