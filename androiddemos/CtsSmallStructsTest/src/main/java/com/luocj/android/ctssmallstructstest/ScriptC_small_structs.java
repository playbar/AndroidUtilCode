/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: cts/tests/tests/renderscript/src/android/renderscript/cts/small_structs.rs
 */

package com.luocj.android.ctssmallstructstest;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.Float4;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/**
 * @hide
 */
public class ScriptC_small_structs extends ScriptC {
    private static final String __rs_resource_name = "small_structs";
    // Constructor
    public  ScriptC_small_structs(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              small_structsBitCode.getBitCode32(),
              small_structsBitCode.getBitCode64());
        __I8 = Element.I8(rs);
        __I16 = Element.I16(rs);
        __I32 = Element.I32(rs);
        __I64 = Element.I64(rs);
        __F32 = Element.F32(rs);
        __F64 = Element.F64(rs);
        __F32_4 = Element.F32_4(rs);
        __ScriptField_char_array_1 = ScriptField_char_array_1.createElement(rs);
        __ScriptField_char_array_2 = ScriptField_char_array_2.createElement(rs);
        __ScriptField_char_array_3 = ScriptField_char_array_3.createElement(rs);
        __ScriptField_char_array_4 = ScriptField_char_array_4.createElement(rs);
        __ScriptField_char_array_5 = ScriptField_char_array_5.createElement(rs);
        __ScriptField_char_array_6 = ScriptField_char_array_6.createElement(rs);
        __ScriptField_char_array_7 = ScriptField_char_array_7.createElement(rs);
        __ScriptField_char_array_8 = ScriptField_char_array_8.createElement(rs);
        __ScriptField_char_array_9 = ScriptField_char_array_9.createElement(rs);
        __ScriptField_char_array_10 = ScriptField_char_array_10.createElement(rs);
        __ScriptField_char_array_11 = ScriptField_char_array_11.createElement(rs);
        __ScriptField_char_array_12 = ScriptField_char_array_12.createElement(rs);
        __ScriptField_char_array_13 = ScriptField_char_array_13.createElement(rs);
        __ScriptField_char_array_14 = ScriptField_char_array_14.createElement(rs);
        __ScriptField_char_array_15 = ScriptField_char_array_15.createElement(rs);
        __ScriptField_char_array_16 = ScriptField_char_array_16.createElement(rs);
        __ScriptField_char_array_17 = ScriptField_char_array_17.createElement(rs);
        __ScriptField_char_array_18 = ScriptField_char_array_18.createElement(rs);
        __ScriptField_char_array_19 = ScriptField_char_array_19.createElement(rs);
        __ScriptField_char_array_20 = ScriptField_char_array_20.createElement(rs);
        __ScriptField_char_array_21 = ScriptField_char_array_21.createElement(rs);
        __ScriptField_char_array_22 = ScriptField_char_array_22.createElement(rs);
        __ScriptField_char_array_23 = ScriptField_char_array_23.createElement(rs);
        __ScriptField_char_array_24 = ScriptField_char_array_24.createElement(rs);
        __ScriptField_char_array_25 = ScriptField_char_array_25.createElement(rs);
        __ScriptField_char_array_26 = ScriptField_char_array_26.createElement(rs);
        __ScriptField_char_array_27 = ScriptField_char_array_27.createElement(rs);
        __ScriptField_char_array_28 = ScriptField_char_array_28.createElement(rs);
        __ScriptField_char_array_29 = ScriptField_char_array_29.createElement(rs);
        __ScriptField_char_array_30 = ScriptField_char_array_30.createElement(rs);
        __ScriptField_char_array_31 = ScriptField_char_array_31.createElement(rs);
        __ScriptField_char_array_32 = ScriptField_char_array_32.createElement(rs);
        __ScriptField_char_array_33 = ScriptField_char_array_33.createElement(rs);
        __ScriptField_char_array_34 = ScriptField_char_array_34.createElement(rs);
        __ScriptField_char_array_35 = ScriptField_char_array_35.createElement(rs);
        __ScriptField_char_array_36 = ScriptField_char_array_36.createElement(rs);
        __ScriptField_char_array_37 = ScriptField_char_array_37.createElement(rs);
        __ScriptField_char_array_38 = ScriptField_char_array_38.createElement(rs);
        __ScriptField_char_array_39 = ScriptField_char_array_39.createElement(rs);
        __ScriptField_char_array_40 = ScriptField_char_array_40.createElement(rs);
        __ScriptField_char_array_41 = ScriptField_char_array_41.createElement(rs);
        __ScriptField_char_array_42 = ScriptField_char_array_42.createElement(rs);
        __ScriptField_char_array_43 = ScriptField_char_array_43.createElement(rs);
        __ScriptField_char_array_44 = ScriptField_char_array_44.createElement(rs);
        __ScriptField_char_array_45 = ScriptField_char_array_45.createElement(rs);
        __ScriptField_char_array_46 = ScriptField_char_array_46.createElement(rs);
        __ScriptField_char_array_47 = ScriptField_char_array_47.createElement(rs);
        __ScriptField_char_array_48 = ScriptField_char_array_48.createElement(rs);
        __ScriptField_char_array_49 = ScriptField_char_array_49.createElement(rs);
        __ScriptField_char_array_50 = ScriptField_char_array_50.createElement(rs);
        __ScriptField_char_array_51 = ScriptField_char_array_51.createElement(rs);
        __ScriptField_char_array_52 = ScriptField_char_array_52.createElement(rs);
        __ScriptField_char_array_53 = ScriptField_char_array_53.createElement(rs);
        __ScriptField_char_array_54 = ScriptField_char_array_54.createElement(rs);
        __ScriptField_char_array_55 = ScriptField_char_array_55.createElement(rs);
        __ScriptField_char_array_56 = ScriptField_char_array_56.createElement(rs);
        __ScriptField_char_array_57 = ScriptField_char_array_57.createElement(rs);
        __ScriptField_char_array_58 = ScriptField_char_array_58.createElement(rs);
        __ScriptField_char_array_59 = ScriptField_char_array_59.createElement(rs);
        __ScriptField_char_array_60 = ScriptField_char_array_60.createElement(rs);
        __ScriptField_char_array_61 = ScriptField_char_array_61.createElement(rs);
        __ScriptField_char_array_62 = ScriptField_char_array_62.createElement(rs);
        __ScriptField_char_array_63 = ScriptField_char_array_63.createElement(rs);
        __ScriptField_char_array_64 = ScriptField_char_array_64.createElement(rs);
        __ScriptField_two_element_struct_i8_i8 = ScriptField_two_element_struct_i8_i8.createElement(rs);
        __ScriptField_two_element_struct_i8_i16 = ScriptField_two_element_struct_i8_i16.createElement(rs);
        __ScriptField_two_element_struct_i8_i32 = ScriptField_two_element_struct_i8_i32.createElement(rs);
        __ScriptField_two_element_struct_i8_i64 = ScriptField_two_element_struct_i8_i64.createElement(rs);
        __ScriptField_two_element_struct_i8_f32 = ScriptField_two_element_struct_i8_f32.createElement(rs);
        __ScriptField_two_element_struct_i8_f64 = ScriptField_two_element_struct_i8_f64.createElement(rs);
        __ScriptField_two_element_struct_i8_v128 = ScriptField_two_element_struct_i8_v128.createElement(rs);
        __ScriptField_two_element_struct_i16_i8 = ScriptField_two_element_struct_i16_i8.createElement(rs);
        __ScriptField_two_element_struct_i16_i16 = ScriptField_two_element_struct_i16_i16.createElement(rs);
        __ScriptField_two_element_struct_i16_i32 = ScriptField_two_element_struct_i16_i32.createElement(rs);
        __ScriptField_two_element_struct_i16_i64 = ScriptField_two_element_struct_i16_i64.createElement(rs);
        __ScriptField_two_element_struct_i16_f32 = ScriptField_two_element_struct_i16_f32.createElement(rs);
        __ScriptField_two_element_struct_i16_f64 = ScriptField_two_element_struct_i16_f64.createElement(rs);
        __ScriptField_two_element_struct_i16_v128 = ScriptField_two_element_struct_i16_v128.createElement(rs);
        __ScriptField_two_element_struct_i32_i8 = ScriptField_two_element_struct_i32_i8.createElement(rs);
        __ScriptField_two_element_struct_i32_i16 = ScriptField_two_element_struct_i32_i16.createElement(rs);
        __ScriptField_two_element_struct_i32_i32 = ScriptField_two_element_struct_i32_i32.createElement(rs);
        __ScriptField_two_element_struct_i32_i64 = ScriptField_two_element_struct_i32_i64.createElement(rs);
        __ScriptField_two_element_struct_i32_f32 = ScriptField_two_element_struct_i32_f32.createElement(rs);
        __ScriptField_two_element_struct_i32_f64 = ScriptField_two_element_struct_i32_f64.createElement(rs);
        __ScriptField_two_element_struct_i32_v128 = ScriptField_two_element_struct_i32_v128.createElement(rs);
        __ScriptField_two_element_struct_i64_i8 = ScriptField_two_element_struct_i64_i8.createElement(rs);
        __ScriptField_two_element_struct_i64_i16 = ScriptField_two_element_struct_i64_i16.createElement(rs);
        __ScriptField_two_element_struct_i64_i32 = ScriptField_two_element_struct_i64_i32.createElement(rs);
        __ScriptField_two_element_struct_i64_i64 = ScriptField_two_element_struct_i64_i64.createElement(rs);
        __ScriptField_two_element_struct_i64_f32 = ScriptField_two_element_struct_i64_f32.createElement(rs);
        __ScriptField_two_element_struct_i64_f64 = ScriptField_two_element_struct_i64_f64.createElement(rs);
        __ScriptField_two_element_struct_i64_v128 = ScriptField_two_element_struct_i64_v128.createElement(rs);
        __ScriptField_two_element_struct_f32_i8 = ScriptField_two_element_struct_f32_i8.createElement(rs);
        __ScriptField_two_element_struct_f32_i16 = ScriptField_two_element_struct_f32_i16.createElement(rs);
        __ScriptField_two_element_struct_f32_i32 = ScriptField_two_element_struct_f32_i32.createElement(rs);
        __ScriptField_two_element_struct_f32_i64 = ScriptField_two_element_struct_f32_i64.createElement(rs);
        __ScriptField_two_element_struct_f32_f32 = ScriptField_two_element_struct_f32_f32.createElement(rs);
        __ScriptField_two_element_struct_f32_f64 = ScriptField_two_element_struct_f32_f64.createElement(rs);
        __ScriptField_two_element_struct_f32_v128 = ScriptField_two_element_struct_f32_v128.createElement(rs);
        __ScriptField_two_element_struct_f64_i8 = ScriptField_two_element_struct_f64_i8.createElement(rs);
        __ScriptField_two_element_struct_f64_i16 = ScriptField_two_element_struct_f64_i16.createElement(rs);
        __ScriptField_two_element_struct_f64_i32 = ScriptField_two_element_struct_f64_i32.createElement(rs);
        __ScriptField_two_element_struct_f64_i64 = ScriptField_two_element_struct_f64_i64.createElement(rs);
        __ScriptField_two_element_struct_f64_f32 = ScriptField_two_element_struct_f64_f32.createElement(rs);
        __ScriptField_two_element_struct_f64_f64 = ScriptField_two_element_struct_f64_f64.createElement(rs);
        __ScriptField_two_element_struct_f64_v128 = ScriptField_two_element_struct_f64_v128.createElement(rs);
        __ScriptField_two_element_struct_v128_i8 = ScriptField_two_element_struct_v128_i8.createElement(rs);
        __ScriptField_two_element_struct_v128_i16 = ScriptField_two_element_struct_v128_i16.createElement(rs);
        __ScriptField_two_element_struct_v128_i32 = ScriptField_two_element_struct_v128_i32.createElement(rs);
        __ScriptField_two_element_struct_v128_i64 = ScriptField_two_element_struct_v128_i64.createElement(rs);
        __ScriptField_two_element_struct_v128_f32 = ScriptField_two_element_struct_v128_f32.createElement(rs);
        __ScriptField_two_element_struct_v128_f64 = ScriptField_two_element_struct_v128_f64.createElement(rs);
        __ScriptField_two_element_struct_v128_v128 = ScriptField_two_element_struct_v128_v128.createElement(rs);
    }

    private Element __F32;
    private Element __F32_4;
    private Element __F64;
    private Element __I16;
    private Element __I32;
    private Element __I64;
    private Element __I8;
    private Element __ScriptField_char_array_1;
    private Element __ScriptField_char_array_10;
    private Element __ScriptField_char_array_11;
    private Element __ScriptField_char_array_12;
    private Element __ScriptField_char_array_13;
    private Element __ScriptField_char_array_14;
    private Element __ScriptField_char_array_15;
    private Element __ScriptField_char_array_16;
    private Element __ScriptField_char_array_17;
    private Element __ScriptField_char_array_18;
    private Element __ScriptField_char_array_19;
    private Element __ScriptField_char_array_2;
    private Element __ScriptField_char_array_20;
    private Element __ScriptField_char_array_21;
    private Element __ScriptField_char_array_22;
    private Element __ScriptField_char_array_23;
    private Element __ScriptField_char_array_24;
    private Element __ScriptField_char_array_25;
    private Element __ScriptField_char_array_26;
    private Element __ScriptField_char_array_27;
    private Element __ScriptField_char_array_28;
    private Element __ScriptField_char_array_29;
    private Element __ScriptField_char_array_3;
    private Element __ScriptField_char_array_30;
    private Element __ScriptField_char_array_31;
    private Element __ScriptField_char_array_32;
    private Element __ScriptField_char_array_33;
    private Element __ScriptField_char_array_34;
    private Element __ScriptField_char_array_35;
    private Element __ScriptField_char_array_36;
    private Element __ScriptField_char_array_37;
    private Element __ScriptField_char_array_38;
    private Element __ScriptField_char_array_39;
    private Element __ScriptField_char_array_4;
    private Element __ScriptField_char_array_40;
    private Element __ScriptField_char_array_41;
    private Element __ScriptField_char_array_42;
    private Element __ScriptField_char_array_43;
    private Element __ScriptField_char_array_44;
    private Element __ScriptField_char_array_45;
    private Element __ScriptField_char_array_46;
    private Element __ScriptField_char_array_47;
    private Element __ScriptField_char_array_48;
    private Element __ScriptField_char_array_49;
    private Element __ScriptField_char_array_5;
    private Element __ScriptField_char_array_50;
    private Element __ScriptField_char_array_51;
    private Element __ScriptField_char_array_52;
    private Element __ScriptField_char_array_53;
    private Element __ScriptField_char_array_54;
    private Element __ScriptField_char_array_55;
    private Element __ScriptField_char_array_56;
    private Element __ScriptField_char_array_57;
    private Element __ScriptField_char_array_58;
    private Element __ScriptField_char_array_59;
    private Element __ScriptField_char_array_6;
    private Element __ScriptField_char_array_60;
    private Element __ScriptField_char_array_61;
    private Element __ScriptField_char_array_62;
    private Element __ScriptField_char_array_63;
    private Element __ScriptField_char_array_64;
    private Element __ScriptField_char_array_7;
    private Element __ScriptField_char_array_8;
    private Element __ScriptField_char_array_9;
    private Element __ScriptField_two_element_struct_f32_f32;
    private Element __ScriptField_two_element_struct_f32_f64;
    private Element __ScriptField_two_element_struct_f32_i16;
    private Element __ScriptField_two_element_struct_f32_i32;
    private Element __ScriptField_two_element_struct_f32_i64;
    private Element __ScriptField_two_element_struct_f32_i8;
    private Element __ScriptField_two_element_struct_f32_v128;
    private Element __ScriptField_two_element_struct_f64_f32;
    private Element __ScriptField_two_element_struct_f64_f64;
    private Element __ScriptField_two_element_struct_f64_i16;
    private Element __ScriptField_two_element_struct_f64_i32;
    private Element __ScriptField_two_element_struct_f64_i64;
    private Element __ScriptField_two_element_struct_f64_i8;
    private Element __ScriptField_two_element_struct_f64_v128;
    private Element __ScriptField_two_element_struct_i16_f32;
    private Element __ScriptField_two_element_struct_i16_f64;
    private Element __ScriptField_two_element_struct_i16_i16;
    private Element __ScriptField_two_element_struct_i16_i32;
    private Element __ScriptField_two_element_struct_i16_i64;
    private Element __ScriptField_two_element_struct_i16_i8;
    private Element __ScriptField_two_element_struct_i16_v128;
    private Element __ScriptField_two_element_struct_i32_f32;
    private Element __ScriptField_two_element_struct_i32_f64;
    private Element __ScriptField_two_element_struct_i32_i16;
    private Element __ScriptField_two_element_struct_i32_i32;
    private Element __ScriptField_two_element_struct_i32_i64;
    private Element __ScriptField_two_element_struct_i32_i8;
    private Element __ScriptField_two_element_struct_i32_v128;
    private Element __ScriptField_two_element_struct_i64_f32;
    private Element __ScriptField_two_element_struct_i64_f64;
    private Element __ScriptField_two_element_struct_i64_i16;
    private Element __ScriptField_two_element_struct_i64_i32;
    private Element __ScriptField_two_element_struct_i64_i64;
    private Element __ScriptField_two_element_struct_i64_i8;
    private Element __ScriptField_two_element_struct_i64_v128;
    private Element __ScriptField_two_element_struct_i8_f32;
    private Element __ScriptField_two_element_struct_i8_f64;
    private Element __ScriptField_two_element_struct_i8_i16;
    private Element __ScriptField_two_element_struct_i8_i32;
    private Element __ScriptField_two_element_struct_i8_i64;
    private Element __ScriptField_two_element_struct_i8_i8;
    private Element __ScriptField_two_element_struct_i8_v128;
    private Element __ScriptField_two_element_struct_v128_f32;
    private Element __ScriptField_two_element_struct_v128_f64;
    private Element __ScriptField_two_element_struct_v128_i16;
    private Element __ScriptField_two_element_struct_v128_i32;
    private Element __ScriptField_two_element_struct_v128_i64;
    private Element __ScriptField_two_element_struct_v128_i8;
    private Element __ScriptField_two_element_struct_v128_v128;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_F32_4;
    private FieldPacker __rs_fp_F64;
    private FieldPacker __rs_fp_I16;
    private FieldPacker __rs_fp_I32;
    private FieldPacker __rs_fp_I64;
    private FieldPacker __rs_fp_I8;
    private final static int mExportVarIdx_initial_value_int8_t = 0;
    private byte mExportVar_initial_value_int8_t;
    public synchronized void set_initial_value_int8_t(byte v) {
        if (__rs_fp_I8!= null) {
            __rs_fp_I8.reset();
        } else {
            __rs_fp_I8 = new FieldPacker(1);
        }
        __rs_fp_I8.addI8(v);
        setVar(mExportVarIdx_initial_value_int8_t, __rs_fp_I8);
        mExportVar_initial_value_int8_t = v;
    }

    public byte get_initial_value_int8_t() {
        return mExportVar_initial_value_int8_t;
    }

    public FieldID getFieldID_initial_value_int8_t() {
        return createFieldID(mExportVarIdx_initial_value_int8_t, null);
    }

    private final static int mExportVarIdx_initial_value_int16_t = 1;
    private short mExportVar_initial_value_int16_t;
    public synchronized void set_initial_value_int16_t(short v) {
        if (__rs_fp_I16!= null) {
            __rs_fp_I16.reset();
        } else {
            __rs_fp_I16 = new FieldPacker(2);
        }
        __rs_fp_I16.addI16(v);
        setVar(mExportVarIdx_initial_value_int16_t, __rs_fp_I16);
        mExportVar_initial_value_int16_t = v;
    }

    public short get_initial_value_int16_t() {
        return mExportVar_initial_value_int16_t;
    }

    public FieldID getFieldID_initial_value_int16_t() {
        return createFieldID(mExportVarIdx_initial_value_int16_t, null);
    }

    private final static int mExportVarIdx_initial_value_int32_t = 2;
    private int mExportVar_initial_value_int32_t;
    public synchronized void set_initial_value_int32_t(int v) {
        setVar(mExportVarIdx_initial_value_int32_t, v);
        mExportVar_initial_value_int32_t = v;
    }

    public int get_initial_value_int32_t() {
        return mExportVar_initial_value_int32_t;
    }

    public FieldID getFieldID_initial_value_int32_t() {
        return createFieldID(mExportVarIdx_initial_value_int32_t, null);
    }

    private final static int mExportVarIdx_initial_value_int64_t = 3;
    private long mExportVar_initial_value_int64_t;
    public synchronized void set_initial_value_int64_t(long v) {
        setVar(mExportVarIdx_initial_value_int64_t, v);
        mExportVar_initial_value_int64_t = v;
    }

    public long get_initial_value_int64_t() {
        return mExportVar_initial_value_int64_t;
    }

    public FieldID getFieldID_initial_value_int64_t() {
        return createFieldID(mExportVarIdx_initial_value_int64_t, null);
    }

    private final static int mExportVarIdx_initial_value_float = 4;
    private float mExportVar_initial_value_float;
    public synchronized void set_initial_value_float(float v) {
        setVar(mExportVarIdx_initial_value_float, v);
        mExportVar_initial_value_float = v;
    }

    public float get_initial_value_float() {
        return mExportVar_initial_value_float;
    }

    public FieldID getFieldID_initial_value_float() {
        return createFieldID(mExportVarIdx_initial_value_float, null);
    }

    private final static int mExportVarIdx_initial_value_double = 5;
    private double mExportVar_initial_value_double;
    public synchronized void set_initial_value_double(double v) {
        setVar(mExportVarIdx_initial_value_double, v);
        mExportVar_initial_value_double = v;
    }

    public double get_initial_value_double() {
        return mExportVar_initial_value_double;
    }

    public FieldID getFieldID_initial_value_double() {
        return createFieldID(mExportVarIdx_initial_value_double, null);
    }

    private final static int mExportVarIdx_initial_value_float4 = 6;
    private Float4 mExportVar_initial_value_float4;
    public synchronized void set_initial_value_float4(Float4 v) {
        mExportVar_initial_value_float4 = v;
        FieldPacker fp = new FieldPacker(16);
        fp.addF32(v);
        int []__dimArr = new int[1];
        __dimArr[0] = 1;
        setVar(mExportVarIdx_initial_value_float4, fp, __F32_4, __dimArr);
    }

    public Float4 get_initial_value_float4() {
        return mExportVar_initial_value_float4;
    }

    public FieldID getFieldID_initial_value_float4() {
        return createFieldID(mExportVarIdx_initial_value_float4, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_modify_char_array_1 = 1;
    public KernelID getKernelID_modify_char_array_1() {
        return createKernelID(mExportForEachIdx_modify_char_array_1, 35, null, null);
    }

    public void forEach_modify_char_array_1(Allocation ain, Allocation aout) {
        forEach_modify_char_array_1(ain, aout, null);
    }

    public void forEach_modify_char_array_1(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_1)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_1!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_1)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_1!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_1, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_2 = 2;
    public KernelID getKernelID_modify_char_array_2() {
        return createKernelID(mExportForEachIdx_modify_char_array_2, 35, null, null);
    }

    public void forEach_modify_char_array_2(Allocation ain, Allocation aout) {
        forEach_modify_char_array_2(ain, aout, null);
    }

    public void forEach_modify_char_array_2(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_2)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_2!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_2)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_2!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_2, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_3 = 3;
    public KernelID getKernelID_modify_char_array_3() {
        return createKernelID(mExportForEachIdx_modify_char_array_3, 35, null, null);
    }

    public void forEach_modify_char_array_3(Allocation ain, Allocation aout) {
        forEach_modify_char_array_3(ain, aout, null);
    }

    public void forEach_modify_char_array_3(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_3)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_3)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_3!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_3, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_4 = 4;
    public KernelID getKernelID_modify_char_array_4() {
        return createKernelID(mExportForEachIdx_modify_char_array_4, 35, null, null);
    }

    public void forEach_modify_char_array_4(Allocation ain, Allocation aout) {
        forEach_modify_char_array_4(ain, aout, null);
    }

    public void forEach_modify_char_array_4(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_4)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_4)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_4, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_5 = 5;
    public KernelID getKernelID_modify_char_array_5() {
        return createKernelID(mExportForEachIdx_modify_char_array_5, 35, null, null);
    }

    public void forEach_modify_char_array_5(Allocation ain, Allocation aout) {
        forEach_modify_char_array_5(ain, aout, null);
    }

    public void forEach_modify_char_array_5(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_5)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_5!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_5)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_5!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_5, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_6 = 6;
    public KernelID getKernelID_modify_char_array_6() {
        return createKernelID(mExportForEachIdx_modify_char_array_6, 35, null, null);
    }

    public void forEach_modify_char_array_6(Allocation ain, Allocation aout) {
        forEach_modify_char_array_6(ain, aout, null);
    }

    public void forEach_modify_char_array_6(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_6)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_6!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_6)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_6!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_6, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_7 = 7;
    public KernelID getKernelID_modify_char_array_7() {
        return createKernelID(mExportForEachIdx_modify_char_array_7, 35, null, null);
    }

    public void forEach_modify_char_array_7(Allocation ain, Allocation aout) {
        forEach_modify_char_array_7(ain, aout, null);
    }

    public void forEach_modify_char_array_7(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_7)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_7!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_7)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_7!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_7, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_8 = 8;
    public KernelID getKernelID_modify_char_array_8() {
        return createKernelID(mExportForEachIdx_modify_char_array_8, 35, null, null);
    }

    public void forEach_modify_char_array_8(Allocation ain, Allocation aout) {
        forEach_modify_char_array_8(ain, aout, null);
    }

    public void forEach_modify_char_array_8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_9 = 9;
    public KernelID getKernelID_modify_char_array_9() {
        return createKernelID(mExportForEachIdx_modify_char_array_9, 35, null, null);
    }

    public void forEach_modify_char_array_9(Allocation ain, Allocation aout) {
        forEach_modify_char_array_9(ain, aout, null);
    }

    public void forEach_modify_char_array_9(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_9)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_9!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_9)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_9!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_9, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_10 = 10;
    public KernelID getKernelID_modify_char_array_10() {
        return createKernelID(mExportForEachIdx_modify_char_array_10, 35, null, null);
    }

    public void forEach_modify_char_array_10(Allocation ain, Allocation aout) {
        forEach_modify_char_array_10(ain, aout, null);
    }

    public void forEach_modify_char_array_10(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_10)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_10!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_10)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_10!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_10, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_11 = 11;
    public KernelID getKernelID_modify_char_array_11() {
        return createKernelID(mExportForEachIdx_modify_char_array_11, 35, null, null);
    }

    public void forEach_modify_char_array_11(Allocation ain, Allocation aout) {
        forEach_modify_char_array_11(ain, aout, null);
    }

    public void forEach_modify_char_array_11(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_11)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_11!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_11)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_11!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_11, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_12 = 12;
    public KernelID getKernelID_modify_char_array_12() {
        return createKernelID(mExportForEachIdx_modify_char_array_12, 35, null, null);
    }

    public void forEach_modify_char_array_12(Allocation ain, Allocation aout) {
        forEach_modify_char_array_12(ain, aout, null);
    }

    public void forEach_modify_char_array_12(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_12)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_12!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_12)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_12!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_12, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_13 = 13;
    public KernelID getKernelID_modify_char_array_13() {
        return createKernelID(mExportForEachIdx_modify_char_array_13, 35, null, null);
    }

    public void forEach_modify_char_array_13(Allocation ain, Allocation aout) {
        forEach_modify_char_array_13(ain, aout, null);
    }

    public void forEach_modify_char_array_13(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_13)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_13!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_13)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_13!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_13, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_14 = 14;
    public KernelID getKernelID_modify_char_array_14() {
        return createKernelID(mExportForEachIdx_modify_char_array_14, 35, null, null);
    }

    public void forEach_modify_char_array_14(Allocation ain, Allocation aout) {
        forEach_modify_char_array_14(ain, aout, null);
    }

    public void forEach_modify_char_array_14(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_14)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_14!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_14)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_14!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_14, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_15 = 15;
    public KernelID getKernelID_modify_char_array_15() {
        return createKernelID(mExportForEachIdx_modify_char_array_15, 35, null, null);
    }

    public void forEach_modify_char_array_15(Allocation ain, Allocation aout) {
        forEach_modify_char_array_15(ain, aout, null);
    }

    public void forEach_modify_char_array_15(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_15)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_15!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_15)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_15!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_15, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_16 = 16;
    public KernelID getKernelID_modify_char_array_16() {
        return createKernelID(mExportForEachIdx_modify_char_array_16, 35, null, null);
    }

    public void forEach_modify_char_array_16(Allocation ain, Allocation aout) {
        forEach_modify_char_array_16(ain, aout, null);
    }

    public void forEach_modify_char_array_16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_17 = 17;
    public KernelID getKernelID_modify_char_array_17() {
        return createKernelID(mExportForEachIdx_modify_char_array_17, 35, null, null);
    }

    public void forEach_modify_char_array_17(Allocation ain, Allocation aout) {
        forEach_modify_char_array_17(ain, aout, null);
    }

    public void forEach_modify_char_array_17(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_17)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_17!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_17)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_17!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_17, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_18 = 18;
    public KernelID getKernelID_modify_char_array_18() {
        return createKernelID(mExportForEachIdx_modify_char_array_18, 35, null, null);
    }

    public void forEach_modify_char_array_18(Allocation ain, Allocation aout) {
        forEach_modify_char_array_18(ain, aout, null);
    }

    public void forEach_modify_char_array_18(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_18)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_18!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_18)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_18!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_18, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_19 = 19;
    public KernelID getKernelID_modify_char_array_19() {
        return createKernelID(mExportForEachIdx_modify_char_array_19, 35, null, null);
    }

    public void forEach_modify_char_array_19(Allocation ain, Allocation aout) {
        forEach_modify_char_array_19(ain, aout, null);
    }

    public void forEach_modify_char_array_19(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_19)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_19!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_19)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_19!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_19, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_20 = 20;
    public KernelID getKernelID_modify_char_array_20() {
        return createKernelID(mExportForEachIdx_modify_char_array_20, 35, null, null);
    }

    public void forEach_modify_char_array_20(Allocation ain, Allocation aout) {
        forEach_modify_char_array_20(ain, aout, null);
    }

    public void forEach_modify_char_array_20(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_20)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_20!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_20)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_20!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_20, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_21 = 21;
    public KernelID getKernelID_modify_char_array_21() {
        return createKernelID(mExportForEachIdx_modify_char_array_21, 35, null, null);
    }

    public void forEach_modify_char_array_21(Allocation ain, Allocation aout) {
        forEach_modify_char_array_21(ain, aout, null);
    }

    public void forEach_modify_char_array_21(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_21)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_21!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_21)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_21!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_21, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_22 = 22;
    public KernelID getKernelID_modify_char_array_22() {
        return createKernelID(mExportForEachIdx_modify_char_array_22, 35, null, null);
    }

    public void forEach_modify_char_array_22(Allocation ain, Allocation aout) {
        forEach_modify_char_array_22(ain, aout, null);
    }

    public void forEach_modify_char_array_22(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_22)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_22!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_22)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_22!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_22, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_23 = 23;
    public KernelID getKernelID_modify_char_array_23() {
        return createKernelID(mExportForEachIdx_modify_char_array_23, 35, null, null);
    }

    public void forEach_modify_char_array_23(Allocation ain, Allocation aout) {
        forEach_modify_char_array_23(ain, aout, null);
    }

    public void forEach_modify_char_array_23(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_23)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_23!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_23)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_23!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_23, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_24 = 24;
    public KernelID getKernelID_modify_char_array_24() {
        return createKernelID(mExportForEachIdx_modify_char_array_24, 35, null, null);
    }

    public void forEach_modify_char_array_24(Allocation ain, Allocation aout) {
        forEach_modify_char_array_24(ain, aout, null);
    }

    public void forEach_modify_char_array_24(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_24)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_24!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_24)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_24!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_24, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_25 = 25;
    public KernelID getKernelID_modify_char_array_25() {
        return createKernelID(mExportForEachIdx_modify_char_array_25, 35, null, null);
    }

    public void forEach_modify_char_array_25(Allocation ain, Allocation aout) {
        forEach_modify_char_array_25(ain, aout, null);
    }

    public void forEach_modify_char_array_25(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_25)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_25!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_25)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_25!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_25, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_26 = 26;
    public KernelID getKernelID_modify_char_array_26() {
        return createKernelID(mExportForEachIdx_modify_char_array_26, 35, null, null);
    }

    public void forEach_modify_char_array_26(Allocation ain, Allocation aout) {
        forEach_modify_char_array_26(ain, aout, null);
    }

    public void forEach_modify_char_array_26(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_26)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_26!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_26)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_26!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_26, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_27 = 27;
    public KernelID getKernelID_modify_char_array_27() {
        return createKernelID(mExportForEachIdx_modify_char_array_27, 35, null, null);
    }

    public void forEach_modify_char_array_27(Allocation ain, Allocation aout) {
        forEach_modify_char_array_27(ain, aout, null);
    }

    public void forEach_modify_char_array_27(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_27)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_27!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_27)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_27!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_27, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_28 = 28;
    public KernelID getKernelID_modify_char_array_28() {
        return createKernelID(mExportForEachIdx_modify_char_array_28, 35, null, null);
    }

    public void forEach_modify_char_array_28(Allocation ain, Allocation aout) {
        forEach_modify_char_array_28(ain, aout, null);
    }

    public void forEach_modify_char_array_28(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_28)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_28!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_28)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_28!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_28, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_29 = 29;
    public KernelID getKernelID_modify_char_array_29() {
        return createKernelID(mExportForEachIdx_modify_char_array_29, 35, null, null);
    }

    public void forEach_modify_char_array_29(Allocation ain, Allocation aout) {
        forEach_modify_char_array_29(ain, aout, null);
    }

    public void forEach_modify_char_array_29(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_29)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_29!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_29)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_29!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_29, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_30 = 30;
    public KernelID getKernelID_modify_char_array_30() {
        return createKernelID(mExportForEachIdx_modify_char_array_30, 35, null, null);
    }

    public void forEach_modify_char_array_30(Allocation ain, Allocation aout) {
        forEach_modify_char_array_30(ain, aout, null);
    }

    public void forEach_modify_char_array_30(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_30)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_30!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_30)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_30!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_30, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_31 = 31;
    public KernelID getKernelID_modify_char_array_31() {
        return createKernelID(mExportForEachIdx_modify_char_array_31, 35, null, null);
    }

    public void forEach_modify_char_array_31(Allocation ain, Allocation aout) {
        forEach_modify_char_array_31(ain, aout, null);
    }

    public void forEach_modify_char_array_31(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_31)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_31!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_31)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_31!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_31, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_32 = 32;
    public KernelID getKernelID_modify_char_array_32() {
        return createKernelID(mExportForEachIdx_modify_char_array_32, 35, null, null);
    }

    public void forEach_modify_char_array_32(Allocation ain, Allocation aout) {
        forEach_modify_char_array_32(ain, aout, null);
    }

    public void forEach_modify_char_array_32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_33 = 33;
    public KernelID getKernelID_modify_char_array_33() {
        return createKernelID(mExportForEachIdx_modify_char_array_33, 35, null, null);
    }

    public void forEach_modify_char_array_33(Allocation ain, Allocation aout) {
        forEach_modify_char_array_33(ain, aout, null);
    }

    public void forEach_modify_char_array_33(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_33)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_33!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_33)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_33!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_33, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_34 = 34;
    public KernelID getKernelID_modify_char_array_34() {
        return createKernelID(mExportForEachIdx_modify_char_array_34, 35, null, null);
    }

    public void forEach_modify_char_array_34(Allocation ain, Allocation aout) {
        forEach_modify_char_array_34(ain, aout, null);
    }

    public void forEach_modify_char_array_34(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_34)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_34!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_34)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_34!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_34, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_35 = 35;
    public KernelID getKernelID_modify_char_array_35() {
        return createKernelID(mExportForEachIdx_modify_char_array_35, 35, null, null);
    }

    public void forEach_modify_char_array_35(Allocation ain, Allocation aout) {
        forEach_modify_char_array_35(ain, aout, null);
    }

    public void forEach_modify_char_array_35(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_35)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_35!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_35)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_35!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_35, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_36 = 36;
    public KernelID getKernelID_modify_char_array_36() {
        return createKernelID(mExportForEachIdx_modify_char_array_36, 35, null, null);
    }

    public void forEach_modify_char_array_36(Allocation ain, Allocation aout) {
        forEach_modify_char_array_36(ain, aout, null);
    }

    public void forEach_modify_char_array_36(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_36)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_36!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_36)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_36!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_36, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_37 = 37;
    public KernelID getKernelID_modify_char_array_37() {
        return createKernelID(mExportForEachIdx_modify_char_array_37, 35, null, null);
    }

    public void forEach_modify_char_array_37(Allocation ain, Allocation aout) {
        forEach_modify_char_array_37(ain, aout, null);
    }

    public void forEach_modify_char_array_37(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_37)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_37!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_37)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_37!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_37, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_38 = 38;
    public KernelID getKernelID_modify_char_array_38() {
        return createKernelID(mExportForEachIdx_modify_char_array_38, 35, null, null);
    }

    public void forEach_modify_char_array_38(Allocation ain, Allocation aout) {
        forEach_modify_char_array_38(ain, aout, null);
    }

    public void forEach_modify_char_array_38(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_38)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_38!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_38)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_38!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_38, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_39 = 39;
    public KernelID getKernelID_modify_char_array_39() {
        return createKernelID(mExportForEachIdx_modify_char_array_39, 35, null, null);
    }

    public void forEach_modify_char_array_39(Allocation ain, Allocation aout) {
        forEach_modify_char_array_39(ain, aout, null);
    }

    public void forEach_modify_char_array_39(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_39)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_39!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_39)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_39!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_39, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_40 = 40;
    public KernelID getKernelID_modify_char_array_40() {
        return createKernelID(mExportForEachIdx_modify_char_array_40, 35, null, null);
    }

    public void forEach_modify_char_array_40(Allocation ain, Allocation aout) {
        forEach_modify_char_array_40(ain, aout, null);
    }

    public void forEach_modify_char_array_40(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_40)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_40!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_40)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_40!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_40, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_41 = 41;
    public KernelID getKernelID_modify_char_array_41() {
        return createKernelID(mExportForEachIdx_modify_char_array_41, 35, null, null);
    }

    public void forEach_modify_char_array_41(Allocation ain, Allocation aout) {
        forEach_modify_char_array_41(ain, aout, null);
    }

    public void forEach_modify_char_array_41(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_41)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_41!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_41)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_41!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_41, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_42 = 42;
    public KernelID getKernelID_modify_char_array_42() {
        return createKernelID(mExportForEachIdx_modify_char_array_42, 35, null, null);
    }

    public void forEach_modify_char_array_42(Allocation ain, Allocation aout) {
        forEach_modify_char_array_42(ain, aout, null);
    }

    public void forEach_modify_char_array_42(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_42)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_42!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_42)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_42!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_42, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_43 = 43;
    public KernelID getKernelID_modify_char_array_43() {
        return createKernelID(mExportForEachIdx_modify_char_array_43, 35, null, null);
    }

    public void forEach_modify_char_array_43(Allocation ain, Allocation aout) {
        forEach_modify_char_array_43(ain, aout, null);
    }

    public void forEach_modify_char_array_43(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_43)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_43!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_43)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_43!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_43, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_44 = 44;
    public KernelID getKernelID_modify_char_array_44() {
        return createKernelID(mExportForEachIdx_modify_char_array_44, 35, null, null);
    }

    public void forEach_modify_char_array_44(Allocation ain, Allocation aout) {
        forEach_modify_char_array_44(ain, aout, null);
    }

    public void forEach_modify_char_array_44(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_44)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_44!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_44)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_44!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_44, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_45 = 45;
    public KernelID getKernelID_modify_char_array_45() {
        return createKernelID(mExportForEachIdx_modify_char_array_45, 35, null, null);
    }

    public void forEach_modify_char_array_45(Allocation ain, Allocation aout) {
        forEach_modify_char_array_45(ain, aout, null);
    }

    public void forEach_modify_char_array_45(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_45)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_45!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_45)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_45!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_45, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_46 = 46;
    public KernelID getKernelID_modify_char_array_46() {
        return createKernelID(mExportForEachIdx_modify_char_array_46, 35, null, null);
    }

    public void forEach_modify_char_array_46(Allocation ain, Allocation aout) {
        forEach_modify_char_array_46(ain, aout, null);
    }

    public void forEach_modify_char_array_46(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_46)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_46!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_46)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_46!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_46, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_47 = 47;
    public KernelID getKernelID_modify_char_array_47() {
        return createKernelID(mExportForEachIdx_modify_char_array_47, 35, null, null);
    }

    public void forEach_modify_char_array_47(Allocation ain, Allocation aout) {
        forEach_modify_char_array_47(ain, aout, null);
    }

    public void forEach_modify_char_array_47(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_47)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_47!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_47)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_47!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_47, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_48 = 48;
    public KernelID getKernelID_modify_char_array_48() {
        return createKernelID(mExportForEachIdx_modify_char_array_48, 35, null, null);
    }

    public void forEach_modify_char_array_48(Allocation ain, Allocation aout) {
        forEach_modify_char_array_48(ain, aout, null);
    }

    public void forEach_modify_char_array_48(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_48)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_48!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_48)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_48!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_48, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_49 = 49;
    public KernelID getKernelID_modify_char_array_49() {
        return createKernelID(mExportForEachIdx_modify_char_array_49, 35, null, null);
    }

    public void forEach_modify_char_array_49(Allocation ain, Allocation aout) {
        forEach_modify_char_array_49(ain, aout, null);
    }

    public void forEach_modify_char_array_49(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_49)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_49!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_49)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_49!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_49, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_50 = 50;
    public KernelID getKernelID_modify_char_array_50() {
        return createKernelID(mExportForEachIdx_modify_char_array_50, 35, null, null);
    }

    public void forEach_modify_char_array_50(Allocation ain, Allocation aout) {
        forEach_modify_char_array_50(ain, aout, null);
    }

    public void forEach_modify_char_array_50(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_50)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_50!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_50)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_50!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_50, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_51 = 51;
    public KernelID getKernelID_modify_char_array_51() {
        return createKernelID(mExportForEachIdx_modify_char_array_51, 35, null, null);
    }

    public void forEach_modify_char_array_51(Allocation ain, Allocation aout) {
        forEach_modify_char_array_51(ain, aout, null);
    }

    public void forEach_modify_char_array_51(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_51)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_51!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_51)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_51!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_51, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_52 = 52;
    public KernelID getKernelID_modify_char_array_52() {
        return createKernelID(mExportForEachIdx_modify_char_array_52, 35, null, null);
    }

    public void forEach_modify_char_array_52(Allocation ain, Allocation aout) {
        forEach_modify_char_array_52(ain, aout, null);
    }

    public void forEach_modify_char_array_52(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_52)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_52!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_52)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_52!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_52, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_53 = 53;
    public KernelID getKernelID_modify_char_array_53() {
        return createKernelID(mExportForEachIdx_modify_char_array_53, 35, null, null);
    }

    public void forEach_modify_char_array_53(Allocation ain, Allocation aout) {
        forEach_modify_char_array_53(ain, aout, null);
    }

    public void forEach_modify_char_array_53(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_53)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_53!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_53)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_53!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_53, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_54 = 54;
    public KernelID getKernelID_modify_char_array_54() {
        return createKernelID(mExportForEachIdx_modify_char_array_54, 35, null, null);
    }

    public void forEach_modify_char_array_54(Allocation ain, Allocation aout) {
        forEach_modify_char_array_54(ain, aout, null);
    }

    public void forEach_modify_char_array_54(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_54)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_54!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_54)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_54!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_54, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_55 = 55;
    public KernelID getKernelID_modify_char_array_55() {
        return createKernelID(mExportForEachIdx_modify_char_array_55, 35, null, null);
    }

    public void forEach_modify_char_array_55(Allocation ain, Allocation aout) {
        forEach_modify_char_array_55(ain, aout, null);
    }

    public void forEach_modify_char_array_55(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_55)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_55!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_55)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_55!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_55, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_56 = 56;
    public KernelID getKernelID_modify_char_array_56() {
        return createKernelID(mExportForEachIdx_modify_char_array_56, 35, null, null);
    }

    public void forEach_modify_char_array_56(Allocation ain, Allocation aout) {
        forEach_modify_char_array_56(ain, aout, null);
    }

    public void forEach_modify_char_array_56(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_56)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_56!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_56)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_56!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_56, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_57 = 57;
    public KernelID getKernelID_modify_char_array_57() {
        return createKernelID(mExportForEachIdx_modify_char_array_57, 35, null, null);
    }

    public void forEach_modify_char_array_57(Allocation ain, Allocation aout) {
        forEach_modify_char_array_57(ain, aout, null);
    }

    public void forEach_modify_char_array_57(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_57)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_57!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_57)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_57!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_57, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_58 = 58;
    public KernelID getKernelID_modify_char_array_58() {
        return createKernelID(mExportForEachIdx_modify_char_array_58, 35, null, null);
    }

    public void forEach_modify_char_array_58(Allocation ain, Allocation aout) {
        forEach_modify_char_array_58(ain, aout, null);
    }

    public void forEach_modify_char_array_58(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_58)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_58!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_58)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_58!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_58, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_59 = 59;
    public KernelID getKernelID_modify_char_array_59() {
        return createKernelID(mExportForEachIdx_modify_char_array_59, 35, null, null);
    }

    public void forEach_modify_char_array_59(Allocation ain, Allocation aout) {
        forEach_modify_char_array_59(ain, aout, null);
    }

    public void forEach_modify_char_array_59(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_59)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_59!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_59)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_59!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_59, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_60 = 60;
    public KernelID getKernelID_modify_char_array_60() {
        return createKernelID(mExportForEachIdx_modify_char_array_60, 35, null, null);
    }

    public void forEach_modify_char_array_60(Allocation ain, Allocation aout) {
        forEach_modify_char_array_60(ain, aout, null);
    }

    public void forEach_modify_char_array_60(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_60)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_60!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_60)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_60!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_60, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_61 = 61;
    public KernelID getKernelID_modify_char_array_61() {
        return createKernelID(mExportForEachIdx_modify_char_array_61, 35, null, null);
    }

    public void forEach_modify_char_array_61(Allocation ain, Allocation aout) {
        forEach_modify_char_array_61(ain, aout, null);
    }

    public void forEach_modify_char_array_61(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_61)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_61!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_61)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_61!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_61, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_62 = 62;
    public KernelID getKernelID_modify_char_array_62() {
        return createKernelID(mExportForEachIdx_modify_char_array_62, 35, null, null);
    }

    public void forEach_modify_char_array_62(Allocation ain, Allocation aout) {
        forEach_modify_char_array_62(ain, aout, null);
    }

    public void forEach_modify_char_array_62(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_62)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_62!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_62)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_62!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_62, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_63 = 63;
    public KernelID getKernelID_modify_char_array_63() {
        return createKernelID(mExportForEachIdx_modify_char_array_63, 35, null, null);
    }

    public void forEach_modify_char_array_63(Allocation ain, Allocation aout) {
        forEach_modify_char_array_63(ain, aout, null);
    }

    public void forEach_modify_char_array_63(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_63)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_63!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_63)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_63!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_63, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_char_array_64 = 64;
    public KernelID getKernelID_modify_char_array_64() {
        return createKernelID(mExportForEachIdx_modify_char_array_64, 35, null, null);
    }

    public void forEach_modify_char_array_64(Allocation ain, Allocation aout) {
        forEach_modify_char_array_64(ain, aout, null);
    }

    public void forEach_modify_char_array_64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_char_array_64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_char_array_64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_char_array_64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_char_array_64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_i8 = 65;
    public KernelID getKernelID_modify_two_element_struct_i8_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_i16 = 66;
    public KernelID getKernelID_modify_two_element_struct_i8_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_i32 = 67;
    public KernelID getKernelID_modify_two_element_struct_i8_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_i64 = 68;
    public KernelID getKernelID_modify_two_element_struct_i8_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_f32 = 69;
    public KernelID getKernelID_modify_two_element_struct_i8_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_f64 = 70;
    public KernelID getKernelID_modify_two_element_struct_i8_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i8_v128 = 71;
    public KernelID getKernelID_modify_two_element_struct_i8_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i8_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i8_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i8_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i8_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i8_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i8_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i8_v128, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_i8 = 72;
    public KernelID getKernelID_modify_two_element_struct_i16_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_i16 = 73;
    public KernelID getKernelID_modify_two_element_struct_i16_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_i32 = 74;
    public KernelID getKernelID_modify_two_element_struct_i16_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_i64 = 75;
    public KernelID getKernelID_modify_two_element_struct_i16_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_f32 = 76;
    public KernelID getKernelID_modify_two_element_struct_i16_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_f64 = 77;
    public KernelID getKernelID_modify_two_element_struct_i16_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i16_v128 = 78;
    public KernelID getKernelID_modify_two_element_struct_i16_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i16_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i16_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i16_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i16_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i16_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i16_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i16_v128, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_i8 = 79;
    public KernelID getKernelID_modify_two_element_struct_i32_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_i16 = 80;
    public KernelID getKernelID_modify_two_element_struct_i32_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_i32 = 81;
    public KernelID getKernelID_modify_two_element_struct_i32_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_i64 = 82;
    public KernelID getKernelID_modify_two_element_struct_i32_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_f32 = 83;
    public KernelID getKernelID_modify_two_element_struct_i32_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_f64 = 84;
    public KernelID getKernelID_modify_two_element_struct_i32_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i32_v128 = 85;
    public KernelID getKernelID_modify_two_element_struct_i32_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i32_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i32_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i32_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i32_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i32_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i32_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i32_v128, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_i8 = 86;
    public KernelID getKernelID_modify_two_element_struct_i64_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_i16 = 87;
    public KernelID getKernelID_modify_two_element_struct_i64_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_i32 = 88;
    public KernelID getKernelID_modify_two_element_struct_i64_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_i64 = 89;
    public KernelID getKernelID_modify_two_element_struct_i64_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_f32 = 90;
    public KernelID getKernelID_modify_two_element_struct_i64_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_f64 = 91;
    public KernelID getKernelID_modify_two_element_struct_i64_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_i64_v128 = 92;
    public KernelID getKernelID_modify_two_element_struct_i64_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_i64_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_i64_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_i64_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_i64_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_i64_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_i64_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_i64_v128, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_i8 = 93;
    public KernelID getKernelID_modify_two_element_struct_f32_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_i16 = 94;
    public KernelID getKernelID_modify_two_element_struct_f32_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_i32 = 95;
    public KernelID getKernelID_modify_two_element_struct_f32_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_i64 = 96;
    public KernelID getKernelID_modify_two_element_struct_f32_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_f32 = 97;
    public KernelID getKernelID_modify_two_element_struct_f32_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_f64 = 98;
    public KernelID getKernelID_modify_two_element_struct_f32_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f32_v128 = 99;
    public KernelID getKernelID_modify_two_element_struct_f32_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f32_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f32_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f32_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f32_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f32_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f32_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f32_v128, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_i8 = 100;
    public KernelID getKernelID_modify_two_element_struct_f64_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_i16 = 101;
    public KernelID getKernelID_modify_two_element_struct_f64_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_i32 = 102;
    public KernelID getKernelID_modify_two_element_struct_f64_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_i64 = 103;
    public KernelID getKernelID_modify_two_element_struct_f64_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_f32 = 104;
    public KernelID getKernelID_modify_two_element_struct_f64_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_f64 = 105;
    public KernelID getKernelID_modify_two_element_struct_f64_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_f64_v128 = 106;
    public KernelID getKernelID_modify_two_element_struct_f64_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_f64_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_f64_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_f64_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_f64_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_f64_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_f64_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_f64_v128, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_i8 = 107;
    public KernelID getKernelID_modify_two_element_struct_v128_i8() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_i8, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_i8(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_i8(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_i8(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i8!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i8)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i8!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_i8, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_i16 = 108;
    public KernelID getKernelID_modify_two_element_struct_v128_i16() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_i16, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_i16(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_i16(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_i16(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i16!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i16)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i16!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_i16, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_i32 = 109;
    public KernelID getKernelID_modify_two_element_struct_v128_i32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_i32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_i32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_i32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_i32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_i32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_i64 = 110;
    public KernelID getKernelID_modify_two_element_struct_v128_i64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_i64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_i64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_i64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_i64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_i64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_i64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_i64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_f32 = 111;
    public KernelID getKernelID_modify_two_element_struct_v128_f32() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_f32, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_f32(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_f32(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_f32(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_f32!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_f32)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_f32!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_f32, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_f64 = 112;
    public KernelID getKernelID_modify_two_element_struct_v128_f64() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_f64, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_f64(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_f64(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_f64(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_f64!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_f64)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_f64!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_f64, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_modify_two_element_struct_v128_v128 = 113;
    public KernelID getKernelID_modify_two_element_struct_v128_v128() {
        return createKernelID(mExportForEachIdx_modify_two_element_struct_v128_v128, 43, null, null);
    }

    public void forEach_modify_two_element_struct_v128_v128(Allocation ain, Allocation aout) {
        forEach_modify_two_element_struct_v128_v128(ain, aout, null);
    }

    public void forEach_modify_two_element_struct_v128_v128(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_v128!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__ScriptField_two_element_struct_v128_v128)) {
            throw new RSRuntimeException("Type mismatch with ScriptField_two_element_struct_v128_v128!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_modify_two_element_struct_v128_v128, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_checkError = 0;
    public InvokeID getInvokeID_checkError() {
        return createInvokeID(mExportFuncIdx_checkError);
    }

    public void invoke_checkError() {
        invoke(mExportFuncIdx_checkError);
    }

    private final static int mExportFuncIdx_checkNumberOfCharArrayTestsRun = 1;
    public InvokeID getInvokeID_checkNumberOfCharArrayTestsRun() {
        return createInvokeID(mExportFuncIdx_checkNumberOfCharArrayTestsRun);
    }

    public void invoke_checkNumberOfCharArrayTestsRun() {
        invoke(mExportFuncIdx_checkNumberOfCharArrayTestsRun);
    }

    private final static int mExportFuncIdx_verify_char_array_1 = 2;
    public InvokeID getInvokeID_verify_char_array_1() {
        return createInvokeID(mExportFuncIdx_verify_char_array_1);
    }

    public void invoke_verify_char_array_1(Allocation alloc) {
        FieldPacker verify_char_array_1_fp = new FieldPacker(32);
        verify_char_array_1_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_1, verify_char_array_1_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_2 = 3;
    public InvokeID getInvokeID_verify_char_array_2() {
        return createInvokeID(mExportFuncIdx_verify_char_array_2);
    }

    public void invoke_verify_char_array_2(Allocation alloc) {
        FieldPacker verify_char_array_2_fp = new FieldPacker(32);
        verify_char_array_2_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_2, verify_char_array_2_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_3 = 4;
    public InvokeID getInvokeID_verify_char_array_3() {
        return createInvokeID(mExportFuncIdx_verify_char_array_3);
    }

    public void invoke_verify_char_array_3(Allocation alloc) {
        FieldPacker verify_char_array_3_fp = new FieldPacker(32);
        verify_char_array_3_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_3, verify_char_array_3_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_4 = 5;
    public InvokeID getInvokeID_verify_char_array_4() {
        return createInvokeID(mExportFuncIdx_verify_char_array_4);
    }

    public void invoke_verify_char_array_4(Allocation alloc) {
        FieldPacker verify_char_array_4_fp = new FieldPacker(32);
        verify_char_array_4_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_4, verify_char_array_4_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_5 = 6;
    public InvokeID getInvokeID_verify_char_array_5() {
        return createInvokeID(mExportFuncIdx_verify_char_array_5);
    }

    public void invoke_verify_char_array_5(Allocation alloc) {
        FieldPacker verify_char_array_5_fp = new FieldPacker(32);
        verify_char_array_5_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_5, verify_char_array_5_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_6 = 7;
    public InvokeID getInvokeID_verify_char_array_6() {
        return createInvokeID(mExportFuncIdx_verify_char_array_6);
    }

    public void invoke_verify_char_array_6(Allocation alloc) {
        FieldPacker verify_char_array_6_fp = new FieldPacker(32);
        verify_char_array_6_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_6, verify_char_array_6_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_7 = 8;
    public InvokeID getInvokeID_verify_char_array_7() {
        return createInvokeID(mExportFuncIdx_verify_char_array_7);
    }

    public void invoke_verify_char_array_7(Allocation alloc) {
        FieldPacker verify_char_array_7_fp = new FieldPacker(32);
        verify_char_array_7_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_7, verify_char_array_7_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_8 = 9;
    public InvokeID getInvokeID_verify_char_array_8() {
        return createInvokeID(mExportFuncIdx_verify_char_array_8);
    }

    public void invoke_verify_char_array_8(Allocation alloc) {
        FieldPacker verify_char_array_8_fp = new FieldPacker(32);
        verify_char_array_8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_8, verify_char_array_8_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_9 = 10;
    public InvokeID getInvokeID_verify_char_array_9() {
        return createInvokeID(mExportFuncIdx_verify_char_array_9);
    }

    public void invoke_verify_char_array_9(Allocation alloc) {
        FieldPacker verify_char_array_9_fp = new FieldPacker(32);
        verify_char_array_9_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_9, verify_char_array_9_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_10 = 11;
    public InvokeID getInvokeID_verify_char_array_10() {
        return createInvokeID(mExportFuncIdx_verify_char_array_10);
    }

    public void invoke_verify_char_array_10(Allocation alloc) {
        FieldPacker verify_char_array_10_fp = new FieldPacker(32);
        verify_char_array_10_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_10, verify_char_array_10_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_11 = 12;
    public InvokeID getInvokeID_verify_char_array_11() {
        return createInvokeID(mExportFuncIdx_verify_char_array_11);
    }

    public void invoke_verify_char_array_11(Allocation alloc) {
        FieldPacker verify_char_array_11_fp = new FieldPacker(32);
        verify_char_array_11_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_11, verify_char_array_11_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_12 = 13;
    public InvokeID getInvokeID_verify_char_array_12() {
        return createInvokeID(mExportFuncIdx_verify_char_array_12);
    }

    public void invoke_verify_char_array_12(Allocation alloc) {
        FieldPacker verify_char_array_12_fp = new FieldPacker(32);
        verify_char_array_12_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_12, verify_char_array_12_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_13 = 14;
    public InvokeID getInvokeID_verify_char_array_13() {
        return createInvokeID(mExportFuncIdx_verify_char_array_13);
    }

    public void invoke_verify_char_array_13(Allocation alloc) {
        FieldPacker verify_char_array_13_fp = new FieldPacker(32);
        verify_char_array_13_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_13, verify_char_array_13_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_14 = 15;
    public InvokeID getInvokeID_verify_char_array_14() {
        return createInvokeID(mExportFuncIdx_verify_char_array_14);
    }

    public void invoke_verify_char_array_14(Allocation alloc) {
        FieldPacker verify_char_array_14_fp = new FieldPacker(32);
        verify_char_array_14_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_14, verify_char_array_14_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_15 = 16;
    public InvokeID getInvokeID_verify_char_array_15() {
        return createInvokeID(mExportFuncIdx_verify_char_array_15);
    }

    public void invoke_verify_char_array_15(Allocation alloc) {
        FieldPacker verify_char_array_15_fp = new FieldPacker(32);
        verify_char_array_15_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_15, verify_char_array_15_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_16 = 17;
    public InvokeID getInvokeID_verify_char_array_16() {
        return createInvokeID(mExportFuncIdx_verify_char_array_16);
    }

    public void invoke_verify_char_array_16(Allocation alloc) {
        FieldPacker verify_char_array_16_fp = new FieldPacker(32);
        verify_char_array_16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_16, verify_char_array_16_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_17 = 18;
    public InvokeID getInvokeID_verify_char_array_17() {
        return createInvokeID(mExportFuncIdx_verify_char_array_17);
    }

    public void invoke_verify_char_array_17(Allocation alloc) {
        FieldPacker verify_char_array_17_fp = new FieldPacker(32);
        verify_char_array_17_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_17, verify_char_array_17_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_18 = 19;
    public InvokeID getInvokeID_verify_char_array_18() {
        return createInvokeID(mExportFuncIdx_verify_char_array_18);
    }

    public void invoke_verify_char_array_18(Allocation alloc) {
        FieldPacker verify_char_array_18_fp = new FieldPacker(32);
        verify_char_array_18_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_18, verify_char_array_18_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_19 = 20;
    public InvokeID getInvokeID_verify_char_array_19() {
        return createInvokeID(mExportFuncIdx_verify_char_array_19);
    }

    public void invoke_verify_char_array_19(Allocation alloc) {
        FieldPacker verify_char_array_19_fp = new FieldPacker(32);
        verify_char_array_19_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_19, verify_char_array_19_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_20 = 21;
    public InvokeID getInvokeID_verify_char_array_20() {
        return createInvokeID(mExportFuncIdx_verify_char_array_20);
    }

    public void invoke_verify_char_array_20(Allocation alloc) {
        FieldPacker verify_char_array_20_fp = new FieldPacker(32);
        verify_char_array_20_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_20, verify_char_array_20_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_21 = 22;
    public InvokeID getInvokeID_verify_char_array_21() {
        return createInvokeID(mExportFuncIdx_verify_char_array_21);
    }

    public void invoke_verify_char_array_21(Allocation alloc) {
        FieldPacker verify_char_array_21_fp = new FieldPacker(32);
        verify_char_array_21_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_21, verify_char_array_21_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_22 = 23;
    public InvokeID getInvokeID_verify_char_array_22() {
        return createInvokeID(mExportFuncIdx_verify_char_array_22);
    }

    public void invoke_verify_char_array_22(Allocation alloc) {
        FieldPacker verify_char_array_22_fp = new FieldPacker(32);
        verify_char_array_22_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_22, verify_char_array_22_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_23 = 24;
    public InvokeID getInvokeID_verify_char_array_23() {
        return createInvokeID(mExportFuncIdx_verify_char_array_23);
    }

    public void invoke_verify_char_array_23(Allocation alloc) {
        FieldPacker verify_char_array_23_fp = new FieldPacker(32);
        verify_char_array_23_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_23, verify_char_array_23_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_24 = 25;
    public InvokeID getInvokeID_verify_char_array_24() {
        return createInvokeID(mExportFuncIdx_verify_char_array_24);
    }

    public void invoke_verify_char_array_24(Allocation alloc) {
        FieldPacker verify_char_array_24_fp = new FieldPacker(32);
        verify_char_array_24_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_24, verify_char_array_24_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_25 = 26;
    public InvokeID getInvokeID_verify_char_array_25() {
        return createInvokeID(mExportFuncIdx_verify_char_array_25);
    }

    public void invoke_verify_char_array_25(Allocation alloc) {
        FieldPacker verify_char_array_25_fp = new FieldPacker(32);
        verify_char_array_25_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_25, verify_char_array_25_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_26 = 27;
    public InvokeID getInvokeID_verify_char_array_26() {
        return createInvokeID(mExportFuncIdx_verify_char_array_26);
    }

    public void invoke_verify_char_array_26(Allocation alloc) {
        FieldPacker verify_char_array_26_fp = new FieldPacker(32);
        verify_char_array_26_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_26, verify_char_array_26_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_27 = 28;
    public InvokeID getInvokeID_verify_char_array_27() {
        return createInvokeID(mExportFuncIdx_verify_char_array_27);
    }

    public void invoke_verify_char_array_27(Allocation alloc) {
        FieldPacker verify_char_array_27_fp = new FieldPacker(32);
        verify_char_array_27_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_27, verify_char_array_27_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_28 = 29;
    public InvokeID getInvokeID_verify_char_array_28() {
        return createInvokeID(mExportFuncIdx_verify_char_array_28);
    }

    public void invoke_verify_char_array_28(Allocation alloc) {
        FieldPacker verify_char_array_28_fp = new FieldPacker(32);
        verify_char_array_28_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_28, verify_char_array_28_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_29 = 30;
    public InvokeID getInvokeID_verify_char_array_29() {
        return createInvokeID(mExportFuncIdx_verify_char_array_29);
    }

    public void invoke_verify_char_array_29(Allocation alloc) {
        FieldPacker verify_char_array_29_fp = new FieldPacker(32);
        verify_char_array_29_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_29, verify_char_array_29_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_30 = 31;
    public InvokeID getInvokeID_verify_char_array_30() {
        return createInvokeID(mExportFuncIdx_verify_char_array_30);
    }

    public void invoke_verify_char_array_30(Allocation alloc) {
        FieldPacker verify_char_array_30_fp = new FieldPacker(32);
        verify_char_array_30_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_30, verify_char_array_30_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_31 = 32;
    public InvokeID getInvokeID_verify_char_array_31() {
        return createInvokeID(mExportFuncIdx_verify_char_array_31);
    }

    public void invoke_verify_char_array_31(Allocation alloc) {
        FieldPacker verify_char_array_31_fp = new FieldPacker(32);
        verify_char_array_31_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_31, verify_char_array_31_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_32 = 33;
    public InvokeID getInvokeID_verify_char_array_32() {
        return createInvokeID(mExportFuncIdx_verify_char_array_32);
    }

    public void invoke_verify_char_array_32(Allocation alloc) {
        FieldPacker verify_char_array_32_fp = new FieldPacker(32);
        verify_char_array_32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_32, verify_char_array_32_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_33 = 34;
    public InvokeID getInvokeID_verify_char_array_33() {
        return createInvokeID(mExportFuncIdx_verify_char_array_33);
    }

    public void invoke_verify_char_array_33(Allocation alloc) {
        FieldPacker verify_char_array_33_fp = new FieldPacker(32);
        verify_char_array_33_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_33, verify_char_array_33_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_34 = 35;
    public InvokeID getInvokeID_verify_char_array_34() {
        return createInvokeID(mExportFuncIdx_verify_char_array_34);
    }

    public void invoke_verify_char_array_34(Allocation alloc) {
        FieldPacker verify_char_array_34_fp = new FieldPacker(32);
        verify_char_array_34_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_34, verify_char_array_34_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_35 = 36;
    public InvokeID getInvokeID_verify_char_array_35() {
        return createInvokeID(mExportFuncIdx_verify_char_array_35);
    }

    public void invoke_verify_char_array_35(Allocation alloc) {
        FieldPacker verify_char_array_35_fp = new FieldPacker(32);
        verify_char_array_35_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_35, verify_char_array_35_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_36 = 37;
    public InvokeID getInvokeID_verify_char_array_36() {
        return createInvokeID(mExportFuncIdx_verify_char_array_36);
    }

    public void invoke_verify_char_array_36(Allocation alloc) {
        FieldPacker verify_char_array_36_fp = new FieldPacker(32);
        verify_char_array_36_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_36, verify_char_array_36_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_37 = 38;
    public InvokeID getInvokeID_verify_char_array_37() {
        return createInvokeID(mExportFuncIdx_verify_char_array_37);
    }

    public void invoke_verify_char_array_37(Allocation alloc) {
        FieldPacker verify_char_array_37_fp = new FieldPacker(32);
        verify_char_array_37_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_37, verify_char_array_37_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_38 = 39;
    public InvokeID getInvokeID_verify_char_array_38() {
        return createInvokeID(mExportFuncIdx_verify_char_array_38);
    }

    public void invoke_verify_char_array_38(Allocation alloc) {
        FieldPacker verify_char_array_38_fp = new FieldPacker(32);
        verify_char_array_38_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_38, verify_char_array_38_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_39 = 40;
    public InvokeID getInvokeID_verify_char_array_39() {
        return createInvokeID(mExportFuncIdx_verify_char_array_39);
    }

    public void invoke_verify_char_array_39(Allocation alloc) {
        FieldPacker verify_char_array_39_fp = new FieldPacker(32);
        verify_char_array_39_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_39, verify_char_array_39_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_40 = 41;
    public InvokeID getInvokeID_verify_char_array_40() {
        return createInvokeID(mExportFuncIdx_verify_char_array_40);
    }

    public void invoke_verify_char_array_40(Allocation alloc) {
        FieldPacker verify_char_array_40_fp = new FieldPacker(32);
        verify_char_array_40_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_40, verify_char_array_40_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_41 = 42;
    public InvokeID getInvokeID_verify_char_array_41() {
        return createInvokeID(mExportFuncIdx_verify_char_array_41);
    }

    public void invoke_verify_char_array_41(Allocation alloc) {
        FieldPacker verify_char_array_41_fp = new FieldPacker(32);
        verify_char_array_41_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_41, verify_char_array_41_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_42 = 43;
    public InvokeID getInvokeID_verify_char_array_42() {
        return createInvokeID(mExportFuncIdx_verify_char_array_42);
    }

    public void invoke_verify_char_array_42(Allocation alloc) {
        FieldPacker verify_char_array_42_fp = new FieldPacker(32);
        verify_char_array_42_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_42, verify_char_array_42_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_43 = 44;
    public InvokeID getInvokeID_verify_char_array_43() {
        return createInvokeID(mExportFuncIdx_verify_char_array_43);
    }

    public void invoke_verify_char_array_43(Allocation alloc) {
        FieldPacker verify_char_array_43_fp = new FieldPacker(32);
        verify_char_array_43_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_43, verify_char_array_43_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_44 = 45;
    public InvokeID getInvokeID_verify_char_array_44() {
        return createInvokeID(mExportFuncIdx_verify_char_array_44);
    }

    public void invoke_verify_char_array_44(Allocation alloc) {
        FieldPacker verify_char_array_44_fp = new FieldPacker(32);
        verify_char_array_44_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_44, verify_char_array_44_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_45 = 46;
    public InvokeID getInvokeID_verify_char_array_45() {
        return createInvokeID(mExportFuncIdx_verify_char_array_45);
    }

    public void invoke_verify_char_array_45(Allocation alloc) {
        FieldPacker verify_char_array_45_fp = new FieldPacker(32);
        verify_char_array_45_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_45, verify_char_array_45_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_46 = 47;
    public InvokeID getInvokeID_verify_char_array_46() {
        return createInvokeID(mExportFuncIdx_verify_char_array_46);
    }

    public void invoke_verify_char_array_46(Allocation alloc) {
        FieldPacker verify_char_array_46_fp = new FieldPacker(32);
        verify_char_array_46_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_46, verify_char_array_46_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_47 = 48;
    public InvokeID getInvokeID_verify_char_array_47() {
        return createInvokeID(mExportFuncIdx_verify_char_array_47);
    }

    public void invoke_verify_char_array_47(Allocation alloc) {
        FieldPacker verify_char_array_47_fp = new FieldPacker(32);
        verify_char_array_47_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_47, verify_char_array_47_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_48 = 49;
    public InvokeID getInvokeID_verify_char_array_48() {
        return createInvokeID(mExportFuncIdx_verify_char_array_48);
    }

    public void invoke_verify_char_array_48(Allocation alloc) {
        FieldPacker verify_char_array_48_fp = new FieldPacker(32);
        verify_char_array_48_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_48, verify_char_array_48_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_49 = 50;
    public InvokeID getInvokeID_verify_char_array_49() {
        return createInvokeID(mExportFuncIdx_verify_char_array_49);
    }

    public void invoke_verify_char_array_49(Allocation alloc) {
        FieldPacker verify_char_array_49_fp = new FieldPacker(32);
        verify_char_array_49_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_49, verify_char_array_49_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_50 = 51;
    public InvokeID getInvokeID_verify_char_array_50() {
        return createInvokeID(mExportFuncIdx_verify_char_array_50);
    }

    public void invoke_verify_char_array_50(Allocation alloc) {
        FieldPacker verify_char_array_50_fp = new FieldPacker(32);
        verify_char_array_50_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_50, verify_char_array_50_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_51 = 52;
    public InvokeID getInvokeID_verify_char_array_51() {
        return createInvokeID(mExportFuncIdx_verify_char_array_51);
    }

    public void invoke_verify_char_array_51(Allocation alloc) {
        FieldPacker verify_char_array_51_fp = new FieldPacker(32);
        verify_char_array_51_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_51, verify_char_array_51_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_52 = 53;
    public InvokeID getInvokeID_verify_char_array_52() {
        return createInvokeID(mExportFuncIdx_verify_char_array_52);
    }

    public void invoke_verify_char_array_52(Allocation alloc) {
        FieldPacker verify_char_array_52_fp = new FieldPacker(32);
        verify_char_array_52_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_52, verify_char_array_52_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_53 = 54;
    public InvokeID getInvokeID_verify_char_array_53() {
        return createInvokeID(mExportFuncIdx_verify_char_array_53);
    }

    public void invoke_verify_char_array_53(Allocation alloc) {
        FieldPacker verify_char_array_53_fp = new FieldPacker(32);
        verify_char_array_53_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_53, verify_char_array_53_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_54 = 55;
    public InvokeID getInvokeID_verify_char_array_54() {
        return createInvokeID(mExportFuncIdx_verify_char_array_54);
    }

    public void invoke_verify_char_array_54(Allocation alloc) {
        FieldPacker verify_char_array_54_fp = new FieldPacker(32);
        verify_char_array_54_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_54, verify_char_array_54_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_55 = 56;
    public InvokeID getInvokeID_verify_char_array_55() {
        return createInvokeID(mExportFuncIdx_verify_char_array_55);
    }

    public void invoke_verify_char_array_55(Allocation alloc) {
        FieldPacker verify_char_array_55_fp = new FieldPacker(32);
        verify_char_array_55_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_55, verify_char_array_55_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_56 = 57;
    public InvokeID getInvokeID_verify_char_array_56() {
        return createInvokeID(mExportFuncIdx_verify_char_array_56);
    }

    public void invoke_verify_char_array_56(Allocation alloc) {
        FieldPacker verify_char_array_56_fp = new FieldPacker(32);
        verify_char_array_56_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_56, verify_char_array_56_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_57 = 58;
    public InvokeID getInvokeID_verify_char_array_57() {
        return createInvokeID(mExportFuncIdx_verify_char_array_57);
    }

    public void invoke_verify_char_array_57(Allocation alloc) {
        FieldPacker verify_char_array_57_fp = new FieldPacker(32);
        verify_char_array_57_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_57, verify_char_array_57_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_58 = 59;
    public InvokeID getInvokeID_verify_char_array_58() {
        return createInvokeID(mExportFuncIdx_verify_char_array_58);
    }

    public void invoke_verify_char_array_58(Allocation alloc) {
        FieldPacker verify_char_array_58_fp = new FieldPacker(32);
        verify_char_array_58_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_58, verify_char_array_58_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_59 = 60;
    public InvokeID getInvokeID_verify_char_array_59() {
        return createInvokeID(mExportFuncIdx_verify_char_array_59);
    }

    public void invoke_verify_char_array_59(Allocation alloc) {
        FieldPacker verify_char_array_59_fp = new FieldPacker(32);
        verify_char_array_59_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_59, verify_char_array_59_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_60 = 61;
    public InvokeID getInvokeID_verify_char_array_60() {
        return createInvokeID(mExportFuncIdx_verify_char_array_60);
    }

    public void invoke_verify_char_array_60(Allocation alloc) {
        FieldPacker verify_char_array_60_fp = new FieldPacker(32);
        verify_char_array_60_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_60, verify_char_array_60_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_61 = 62;
    public InvokeID getInvokeID_verify_char_array_61() {
        return createInvokeID(mExportFuncIdx_verify_char_array_61);
    }

    public void invoke_verify_char_array_61(Allocation alloc) {
        FieldPacker verify_char_array_61_fp = new FieldPacker(32);
        verify_char_array_61_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_61, verify_char_array_61_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_62 = 63;
    public InvokeID getInvokeID_verify_char_array_62() {
        return createInvokeID(mExportFuncIdx_verify_char_array_62);
    }

    public void invoke_verify_char_array_62(Allocation alloc) {
        FieldPacker verify_char_array_62_fp = new FieldPacker(32);
        verify_char_array_62_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_62, verify_char_array_62_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_63 = 64;
    public InvokeID getInvokeID_verify_char_array_63() {
        return createInvokeID(mExportFuncIdx_verify_char_array_63);
    }

    public void invoke_verify_char_array_63(Allocation alloc) {
        FieldPacker verify_char_array_63_fp = new FieldPacker(32);
        verify_char_array_63_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_63, verify_char_array_63_fp);
    }

    private final static int mExportFuncIdx_verify_char_array_64 = 65;
    public InvokeID getInvokeID_verify_char_array_64() {
        return createInvokeID(mExportFuncIdx_verify_char_array_64);
    }

    public void invoke_verify_char_array_64(Allocation alloc) {
        FieldPacker verify_char_array_64_fp = new FieldPacker(32);
        verify_char_array_64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_char_array_64, verify_char_array_64_fp);
    }

    private final static int mExportFuncIdx_checkNumberOfTwoElementStructTestsRun = 66;
    public InvokeID getInvokeID_checkNumberOfTwoElementStructTestsRun() {
        return createInvokeID(mExportFuncIdx_checkNumberOfTwoElementStructTestsRun);
    }

    public void invoke_checkNumberOfTwoElementStructTestsRun() {
        invoke(mExportFuncIdx_checkNumberOfTwoElementStructTestsRun);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_i8 = 67;
    public InvokeID getInvokeID_verify_two_element_struct_i8_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_i8);
    }

    public void invoke_verify_two_element_struct_i8_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_i8_fp = new FieldPacker(32);
        verify_two_element_struct_i8_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_i8, verify_two_element_struct_i8_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_i16 = 68;
    public InvokeID getInvokeID_verify_two_element_struct_i8_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_i16);
    }

    public void invoke_verify_two_element_struct_i8_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_i16_fp = new FieldPacker(32);
        verify_two_element_struct_i8_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_i16, verify_two_element_struct_i8_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_i32 = 69;
    public InvokeID getInvokeID_verify_two_element_struct_i8_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_i32);
    }

    public void invoke_verify_two_element_struct_i8_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_i32_fp = new FieldPacker(32);
        verify_two_element_struct_i8_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_i32, verify_two_element_struct_i8_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_i64 = 70;
    public InvokeID getInvokeID_verify_two_element_struct_i8_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_i64);
    }

    public void invoke_verify_two_element_struct_i8_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_i64_fp = new FieldPacker(32);
        verify_two_element_struct_i8_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_i64, verify_two_element_struct_i8_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_f32 = 71;
    public InvokeID getInvokeID_verify_two_element_struct_i8_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_f32);
    }

    public void invoke_verify_two_element_struct_i8_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_f32_fp = new FieldPacker(32);
        verify_two_element_struct_i8_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_f32, verify_two_element_struct_i8_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_f64 = 72;
    public InvokeID getInvokeID_verify_two_element_struct_i8_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_f64);
    }

    public void invoke_verify_two_element_struct_i8_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_f64_fp = new FieldPacker(32);
        verify_two_element_struct_i8_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_f64, verify_two_element_struct_i8_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i8_v128 = 73;
    public InvokeID getInvokeID_verify_two_element_struct_i8_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i8_v128);
    }

    public void invoke_verify_two_element_struct_i8_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_i8_v128_fp = new FieldPacker(32);
        verify_two_element_struct_i8_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i8_v128, verify_two_element_struct_i8_v128_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_i8 = 74;
    public InvokeID getInvokeID_verify_two_element_struct_i16_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_i8);
    }

    public void invoke_verify_two_element_struct_i16_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_i8_fp = new FieldPacker(32);
        verify_two_element_struct_i16_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_i8, verify_two_element_struct_i16_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_i16 = 75;
    public InvokeID getInvokeID_verify_two_element_struct_i16_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_i16);
    }

    public void invoke_verify_two_element_struct_i16_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_i16_fp = new FieldPacker(32);
        verify_two_element_struct_i16_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_i16, verify_two_element_struct_i16_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_i32 = 76;
    public InvokeID getInvokeID_verify_two_element_struct_i16_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_i32);
    }

    public void invoke_verify_two_element_struct_i16_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_i32_fp = new FieldPacker(32);
        verify_two_element_struct_i16_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_i32, verify_two_element_struct_i16_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_i64 = 77;
    public InvokeID getInvokeID_verify_two_element_struct_i16_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_i64);
    }

    public void invoke_verify_two_element_struct_i16_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_i64_fp = new FieldPacker(32);
        verify_two_element_struct_i16_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_i64, verify_two_element_struct_i16_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_f32 = 78;
    public InvokeID getInvokeID_verify_two_element_struct_i16_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_f32);
    }

    public void invoke_verify_two_element_struct_i16_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_f32_fp = new FieldPacker(32);
        verify_two_element_struct_i16_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_f32, verify_two_element_struct_i16_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_f64 = 79;
    public InvokeID getInvokeID_verify_two_element_struct_i16_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_f64);
    }

    public void invoke_verify_two_element_struct_i16_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_f64_fp = new FieldPacker(32);
        verify_two_element_struct_i16_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_f64, verify_two_element_struct_i16_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i16_v128 = 80;
    public InvokeID getInvokeID_verify_two_element_struct_i16_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i16_v128);
    }

    public void invoke_verify_two_element_struct_i16_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_i16_v128_fp = new FieldPacker(32);
        verify_two_element_struct_i16_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i16_v128, verify_two_element_struct_i16_v128_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_i8 = 81;
    public InvokeID getInvokeID_verify_two_element_struct_i32_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_i8);
    }

    public void invoke_verify_two_element_struct_i32_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_i8_fp = new FieldPacker(32);
        verify_two_element_struct_i32_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_i8, verify_two_element_struct_i32_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_i16 = 82;
    public InvokeID getInvokeID_verify_two_element_struct_i32_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_i16);
    }

    public void invoke_verify_two_element_struct_i32_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_i16_fp = new FieldPacker(32);
        verify_two_element_struct_i32_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_i16, verify_two_element_struct_i32_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_i32 = 83;
    public InvokeID getInvokeID_verify_two_element_struct_i32_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_i32);
    }

    public void invoke_verify_two_element_struct_i32_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_i32_fp = new FieldPacker(32);
        verify_two_element_struct_i32_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_i32, verify_two_element_struct_i32_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_i64 = 84;
    public InvokeID getInvokeID_verify_two_element_struct_i32_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_i64);
    }

    public void invoke_verify_two_element_struct_i32_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_i64_fp = new FieldPacker(32);
        verify_two_element_struct_i32_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_i64, verify_two_element_struct_i32_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_f32 = 85;
    public InvokeID getInvokeID_verify_two_element_struct_i32_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_f32);
    }

    public void invoke_verify_two_element_struct_i32_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_f32_fp = new FieldPacker(32);
        verify_two_element_struct_i32_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_f32, verify_two_element_struct_i32_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_f64 = 86;
    public InvokeID getInvokeID_verify_two_element_struct_i32_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_f64);
    }

    public void invoke_verify_two_element_struct_i32_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_f64_fp = new FieldPacker(32);
        verify_two_element_struct_i32_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_f64, verify_two_element_struct_i32_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i32_v128 = 87;
    public InvokeID getInvokeID_verify_two_element_struct_i32_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i32_v128);
    }

    public void invoke_verify_two_element_struct_i32_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_i32_v128_fp = new FieldPacker(32);
        verify_two_element_struct_i32_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i32_v128, verify_two_element_struct_i32_v128_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_i8 = 88;
    public InvokeID getInvokeID_verify_two_element_struct_i64_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_i8);
    }

    public void invoke_verify_two_element_struct_i64_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_i8_fp = new FieldPacker(32);
        verify_two_element_struct_i64_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_i8, verify_two_element_struct_i64_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_i16 = 89;
    public InvokeID getInvokeID_verify_two_element_struct_i64_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_i16);
    }

    public void invoke_verify_two_element_struct_i64_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_i16_fp = new FieldPacker(32);
        verify_two_element_struct_i64_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_i16, verify_two_element_struct_i64_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_i32 = 90;
    public InvokeID getInvokeID_verify_two_element_struct_i64_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_i32);
    }

    public void invoke_verify_two_element_struct_i64_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_i32_fp = new FieldPacker(32);
        verify_two_element_struct_i64_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_i32, verify_two_element_struct_i64_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_i64 = 91;
    public InvokeID getInvokeID_verify_two_element_struct_i64_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_i64);
    }

    public void invoke_verify_two_element_struct_i64_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_i64_fp = new FieldPacker(32);
        verify_two_element_struct_i64_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_i64, verify_two_element_struct_i64_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_f32 = 92;
    public InvokeID getInvokeID_verify_two_element_struct_i64_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_f32);
    }

    public void invoke_verify_two_element_struct_i64_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_f32_fp = new FieldPacker(32);
        verify_two_element_struct_i64_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_f32, verify_two_element_struct_i64_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_f64 = 93;
    public InvokeID getInvokeID_verify_two_element_struct_i64_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_f64);
    }

    public void invoke_verify_two_element_struct_i64_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_f64_fp = new FieldPacker(32);
        verify_two_element_struct_i64_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_f64, verify_two_element_struct_i64_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_i64_v128 = 94;
    public InvokeID getInvokeID_verify_two_element_struct_i64_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_i64_v128);
    }

    public void invoke_verify_two_element_struct_i64_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_i64_v128_fp = new FieldPacker(32);
        verify_two_element_struct_i64_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_i64_v128, verify_two_element_struct_i64_v128_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_i8 = 95;
    public InvokeID getInvokeID_verify_two_element_struct_f32_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_i8);
    }

    public void invoke_verify_two_element_struct_f32_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_i8_fp = new FieldPacker(32);
        verify_two_element_struct_f32_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_i8, verify_two_element_struct_f32_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_i16 = 96;
    public InvokeID getInvokeID_verify_two_element_struct_f32_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_i16);
    }

    public void invoke_verify_two_element_struct_f32_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_i16_fp = new FieldPacker(32);
        verify_two_element_struct_f32_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_i16, verify_two_element_struct_f32_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_i32 = 97;
    public InvokeID getInvokeID_verify_two_element_struct_f32_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_i32);
    }

    public void invoke_verify_two_element_struct_f32_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_i32_fp = new FieldPacker(32);
        verify_two_element_struct_f32_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_i32, verify_two_element_struct_f32_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_i64 = 98;
    public InvokeID getInvokeID_verify_two_element_struct_f32_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_i64);
    }

    public void invoke_verify_two_element_struct_f32_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_i64_fp = new FieldPacker(32);
        verify_two_element_struct_f32_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_i64, verify_two_element_struct_f32_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_f32 = 99;
    public InvokeID getInvokeID_verify_two_element_struct_f32_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_f32);
    }

    public void invoke_verify_two_element_struct_f32_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_f32_fp = new FieldPacker(32);
        verify_two_element_struct_f32_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_f32, verify_two_element_struct_f32_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_f64 = 100;
    public InvokeID getInvokeID_verify_two_element_struct_f32_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_f64);
    }

    public void invoke_verify_two_element_struct_f32_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_f64_fp = new FieldPacker(32);
        verify_two_element_struct_f32_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_f64, verify_two_element_struct_f32_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f32_v128 = 101;
    public InvokeID getInvokeID_verify_two_element_struct_f32_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f32_v128);
    }

    public void invoke_verify_two_element_struct_f32_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_f32_v128_fp = new FieldPacker(32);
        verify_two_element_struct_f32_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f32_v128, verify_two_element_struct_f32_v128_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_i8 = 102;
    public InvokeID getInvokeID_verify_two_element_struct_f64_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_i8);
    }

    public void invoke_verify_two_element_struct_f64_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_i8_fp = new FieldPacker(32);
        verify_two_element_struct_f64_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_i8, verify_two_element_struct_f64_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_i16 = 103;
    public InvokeID getInvokeID_verify_two_element_struct_f64_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_i16);
    }

    public void invoke_verify_two_element_struct_f64_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_i16_fp = new FieldPacker(32);
        verify_two_element_struct_f64_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_i16, verify_two_element_struct_f64_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_i32 = 104;
    public InvokeID getInvokeID_verify_two_element_struct_f64_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_i32);
    }

    public void invoke_verify_two_element_struct_f64_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_i32_fp = new FieldPacker(32);
        verify_two_element_struct_f64_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_i32, verify_two_element_struct_f64_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_i64 = 105;
    public InvokeID getInvokeID_verify_two_element_struct_f64_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_i64);
    }

    public void invoke_verify_two_element_struct_f64_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_i64_fp = new FieldPacker(32);
        verify_two_element_struct_f64_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_i64, verify_two_element_struct_f64_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_f32 = 106;
    public InvokeID getInvokeID_verify_two_element_struct_f64_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_f32);
    }

    public void invoke_verify_two_element_struct_f64_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_f32_fp = new FieldPacker(32);
        verify_two_element_struct_f64_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_f32, verify_two_element_struct_f64_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_f64 = 107;
    public InvokeID getInvokeID_verify_two_element_struct_f64_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_f64);
    }

    public void invoke_verify_two_element_struct_f64_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_f64_fp = new FieldPacker(32);
        verify_two_element_struct_f64_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_f64, verify_two_element_struct_f64_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_f64_v128 = 108;
    public InvokeID getInvokeID_verify_two_element_struct_f64_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_f64_v128);
    }

    public void invoke_verify_two_element_struct_f64_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_f64_v128_fp = new FieldPacker(32);
        verify_two_element_struct_f64_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_f64_v128, verify_two_element_struct_f64_v128_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_i8 = 109;
    public InvokeID getInvokeID_verify_two_element_struct_v128_i8() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_i8);
    }

    public void invoke_verify_two_element_struct_v128_i8(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_i8_fp = new FieldPacker(32);
        verify_two_element_struct_v128_i8_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_i8, verify_two_element_struct_v128_i8_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_i16 = 110;
    public InvokeID getInvokeID_verify_two_element_struct_v128_i16() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_i16);
    }

    public void invoke_verify_two_element_struct_v128_i16(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_i16_fp = new FieldPacker(32);
        verify_two_element_struct_v128_i16_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_i16, verify_two_element_struct_v128_i16_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_i32 = 111;
    public InvokeID getInvokeID_verify_two_element_struct_v128_i32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_i32);
    }

    public void invoke_verify_two_element_struct_v128_i32(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_i32_fp = new FieldPacker(32);
        verify_two_element_struct_v128_i32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_i32, verify_two_element_struct_v128_i32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_i64 = 112;
    public InvokeID getInvokeID_verify_two_element_struct_v128_i64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_i64);
    }

    public void invoke_verify_two_element_struct_v128_i64(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_i64_fp = new FieldPacker(32);
        verify_two_element_struct_v128_i64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_i64, verify_two_element_struct_v128_i64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_f32 = 113;
    public InvokeID getInvokeID_verify_two_element_struct_v128_f32() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_f32);
    }

    public void invoke_verify_two_element_struct_v128_f32(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_f32_fp = new FieldPacker(32);
        verify_two_element_struct_v128_f32_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_f32, verify_two_element_struct_v128_f32_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_f64 = 114;
    public InvokeID getInvokeID_verify_two_element_struct_v128_f64() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_f64);
    }

    public void invoke_verify_two_element_struct_v128_f64(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_f64_fp = new FieldPacker(32);
        verify_two_element_struct_v128_f64_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_f64, verify_two_element_struct_v128_f64_fp);
    }

    private final static int mExportFuncIdx_verify_two_element_struct_v128_v128 = 115;
    public InvokeID getInvokeID_verify_two_element_struct_v128_v128() {
        return createInvokeID(mExportFuncIdx_verify_two_element_struct_v128_v128);
    }

    public void invoke_verify_two_element_struct_v128_v128(Allocation alloc) {
        FieldPacker verify_two_element_struct_v128_v128_fp = new FieldPacker(32);
        verify_two_element_struct_v128_v128_fp.addObj(alloc);
        invoke(mExportFuncIdx_verify_two_element_struct_v128_v128, verify_two_element_struct_v128_v128_fp);
    }

}

