DESCRIPTION = "Systemd service to launch K3s agent"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS += "k3s-config"

SRC_URI = "file://k3s-agent.service"


S = "${WORKDIR}"

inherit systemd

SYSTEMD_SERVICE:${PN} = "k3s-agent.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/k3s-agent.service ${D}${systemd_system_unitdir}/k3s-agent.service
}
