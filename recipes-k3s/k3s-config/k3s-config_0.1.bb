DESCRIPTION = "K3s agent configuration file"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://config.yaml"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/etc/rancher/k3s
    install -m 0644 ${WORKDIR}/config.yaml ${D}/etc/rancher/k3s/config.yaml
}
