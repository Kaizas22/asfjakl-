#require recipes-image/images/custom-users.inc 
#require recipes-image/images/custom-permissions.inc

IMAGE_BASE_INSTALL = "\
                       packagegroup-custom-utils \
                       packagegroup-custom-network \
                       packagegroup-custom-devel \
                       packagegroup-custom-security \
                       packagegroup-custom-test \
                       packagegroup-custom-library \
                       packagegroup-custom-admin \
                      "

IMAGE_2_BASE_INSTALL = "\
                        packagegroup-custom2-devel \
                        packagegroup-custom2-library \
                       "

IMAGE_3_BASE_INSTALL = "\
                        packagegroup-custom3-utils \
                       "

#IMAGE_INSTALL += "${IMAGE_BASE_INSTALL} ${IMAGE_2_BASE_INSTALL} ${IMAGE_3_BASE_INSTALL}
IMAGE_INSTALL_append = " openssl10"
#IMAGE_INSTALL_append_pn-custom-image-dev = "${IMAGE_2_BASE_INSTALL}"
#IMAGE_FEATURES += "ssh-server-openssh"
#IMAGE_INSTALL_append = " packagegroup-custom"

inherit core-image
