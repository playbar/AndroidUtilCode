//
// Created by luocj on 11/23/17.
//

#ifndef ANDROIDDEBUGDEMOS_SURFACEPIXELVALIDATOR_H
#define ANDROIDDEBUGDEMOS_SURFACEPIXELVALIDATOR_H

#include <cpp/RenderScript.h>

#include <ScriptC_PixelCounter.h>

using namespace android::RSC;

class SurfacePixelValidator {
private:
    sp<RS>  mRS;
    android::RSC::sp<const android::RSC::Element> __rs_elem_U8_4;

    ScriptC_PixelCounter* mPixelCounter;

public:
    SurfacePixelValidator();
    virtual ~SurfacePixelValidator();

    int countBlackishPixels(android::RSC::sp<android::RSC::Allocation> v_in);
};

#endif //ANDROIDDEBUGDEMOS_SURFACEPIXELVALIDATOR_H
