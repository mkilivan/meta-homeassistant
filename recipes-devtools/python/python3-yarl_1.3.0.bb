SUMMARY = "Yet another URL library"
HOMEPAGE = "https://github.com/aio-libs/yarl/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI[md5sum] = "92889c31fce4c8f82b7ee9c2b2ed9cd1"
SRC_URI[sha256sum] = "024ecdc12bc02b321bc66b41327f930d1c2c543fa9a561b39861da9388ba7aa9"

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-multidict (>=4.0) \
    ${PYTHON_PN}-idna (>=2.0) \
"
