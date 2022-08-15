FROM openjdk:11

ARG PGTAG=latest
FROM mysql:$PGTAG