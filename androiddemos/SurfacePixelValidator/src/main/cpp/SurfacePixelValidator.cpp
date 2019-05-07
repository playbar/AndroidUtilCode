#include "SurfacePixelValidator.h"

using namespace android::RSC;

static const unsigned char __txt[] = {'p', 'i', 'x', 'e', 'l', 'c', 'o', 'u', 'n', 't', 'e', 'r'};

SurfacePixelValidator::SurfacePixelValidator() {
    mRS = new RS();
    __rs_elem_U8_4 = android::RSC::Element::U8_4(mRS);
}

SurfacePixelValidator::~SurfacePixelValidator() {
}

int SurfacePixelValidator::countBlackishPixels(android::RSC::sp<android::RSC::Allocation> ain) {
    // Type check for ain
    if (!ain->getType()->getElement()->isCompatible(__rs_elem_U8_4)) {
        mRS->throwError(RS_ERROR_RUNTIME_ERROR, "Incompatible type");
        return 0;
    }

    sp<ScriptC_PixelCounter> pixelCounter = new ScriptC_PixelCounter(mRS);
    pixelCounter->getID();

    // what's a pity, reduce is not supported in ndk.

    return 0;
}