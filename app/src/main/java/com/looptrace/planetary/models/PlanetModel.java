package com.looptrace.planetary.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class PlanetModel implements Parcelable {

    private String id;
    private String name;
    private String englishName;
    private Boolean isPlanet;
    private ArrayList<PlanetMoon> moons;
    private long semimajorAxis;
    private long perihelion;
    private long aphelion;
    private float eccentricity;
    private float inclination;
    private Mass mass;
    private Vol vol;
    private float density;
    private float gravity;
    private float escape;
    private float meanRadius;
    private float equaRadius;
    private float polarRadius;
    private float flattening;
    private String dimension;
    private String sideralOrbit;
    private String sideralRotation;
    private String aroundPlanet;
    private String discoveredBy;
    private String discoveryDate;
    private String alternativeName;
    private float axialTilt;
    private String rel;
    private String image;

    public PlanetModel(String id, String name, String englishName, Boolean isPlanet, ArrayList<PlanetMoon> moons, int semimajorAxis, int perihelion, int aphelion, float eccentricity, float inclination, Mass mass, Vol vol, float density, float gravity, float escape, float meanRadius, float equaRadius, float polarRadius, float flattening, String dimension, String sideralOrbit, String sideralRotation, String aroundPlanet, String discoveredBy, String discoveryDate, String alternativeName, int axialTilt, String rel, String image) {
        this.id = id;
        this.name = name;
        this.englishName = englishName;
        this.isPlanet = isPlanet;
        this.moons = moons;
        this.semimajorAxis = semimajorAxis;
        this.perihelion = perihelion;
        this.aphelion = aphelion;
        this.eccentricity = eccentricity;
        this.inclination = inclination;
        this.mass = mass;
        this.vol = vol;
        this.density = density;
        this.gravity = gravity;
        this.escape = escape;
        this.meanRadius = meanRadius;
        this.equaRadius = equaRadius;
        this.polarRadius = polarRadius;
        this.flattening = flattening;
        this.dimension = dimension;
        this.sideralOrbit = sideralOrbit;
        this.sideralRotation = sideralRotation;
        this.aroundPlanet = aroundPlanet;
        this.discoveredBy = discoveredBy;
        this.discoveryDate = discoveryDate;
        this.alternativeName = alternativeName;
        this.axialTilt = axialTilt;
        this.rel = rel;
        this.image = image;
    }

    protected PlanetModel(Parcel in) {
        id = in.readString();
        name = in.readString();
        englishName = in.readString();
        byte tmpIsPlanet = in.readByte();
        isPlanet = tmpIsPlanet == 0 ? null : tmpIsPlanet == 1;
        semimajorAxis = in.readLong();
        perihelion = in.readLong();
        aphelion = in.readLong();
        eccentricity = in.readFloat();
        inclination = in.readFloat();
        density = in.readFloat();
        gravity = in.readFloat();
        escape = in.readFloat();
        meanRadius = in.readFloat();
        equaRadius = in.readFloat();
        polarRadius = in.readFloat();
        flattening = in.readFloat();
        dimension = in.readString();
        sideralOrbit = in.readString();
        sideralRotation = in.readString();
        aroundPlanet = in.readString();
        discoveredBy = in.readString();
        discoveryDate = in.readString();
        alternativeName = in.readString();
        axialTilt = in.readFloat();
        rel = in.readString();
        image = in.readString();
    }

    public static final Creator<PlanetModel> CREATOR = new Creator<PlanetModel>() {
        @Override
        public PlanetModel createFromParcel(Parcel in) {
            return new PlanetModel(in);
        }

        @Override
        public PlanetModel[] newArray(int size) {
            return new PlanetModel[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Boolean getPlanet() {
        return isPlanet;
    }

    public void setPlanet(Boolean planet) {
        isPlanet = planet;
    }

    public ArrayList<PlanetMoon> getMoons() {
        return moons;
    }

    public void setMoons(ArrayList<PlanetMoon> moons) {
        this.moons = moons;
    }

    public long getSemimajorAxis() {
        return semimajorAxis;
    }

    public void setSemimajorAxis(long semimajorAxis) {
        this.semimajorAxis = semimajorAxis;
    }

    public long getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(long perihelion) {
        this.perihelion = perihelion;
    }

    public long getAphelion() {
        return aphelion;
    }

    public void setAphelion(long aphelion) {
        this.aphelion = aphelion;
    }

    public float getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(float eccentricity) {
        this.eccentricity = eccentricity;
    }

    public float getInclination() {
        return inclination;
    }

    public void setInclination(float inclination) {
        this.inclination = inclination;
    }

    public Mass getMass() {
        return mass;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public float getEscape() {
        return escape;
    }

    public void setEscape(float escape) {
        this.escape = escape;
    }

    public float getMeanRadius() {
        return meanRadius;
    }

    public void setMeanRadius(float meanRadius) {
        this.meanRadius = meanRadius;
    }

    public float getEquaRadius() {
        return equaRadius;
    }

    public void setEquaRadius(float equaRadius) {
        this.equaRadius = equaRadius;
    }

    public float getPolarRadius() {
        return polarRadius;
    }

    public void setPolarRadius(float polarRadius) {
        this.polarRadius = polarRadius;
    }

    public float getFlattening() {
        return flattening;
    }

    public void setFlattening(float flattening) {
        this.flattening = flattening;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getSideralOrbit() {
        return sideralOrbit;
    }

    public void setSideralOrbit(String sideralOrbit) {
        this.sideralOrbit = sideralOrbit;
    }

    public String getSideralRotation() {
        return sideralRotation;
    }

    public void setSideralRotation(String sideralRotation) {
        this.sideralRotation = sideralRotation;
    }

    public String getAroundPlanet() {
        return aroundPlanet;
    }

    public void setAroundPlanet(String aroundPlanet) {
        this.aroundPlanet = aroundPlanet;
    }

    public String getDiscoveredBy() {
        return discoveredBy;
    }

    public void setDiscoveredBy(String discoveredBy) {
        this.discoveredBy = discoveredBy;
    }

    public String getDiscoveryDate() {
        return discoveryDate;
    }

    public void setDiscoveryDate(String discoveryDate) {
        this.discoveryDate = discoveryDate;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public float getAxialTilt() {
        return axialTilt;
    }

    public void setAxialTilt(float axialTilt) {
        this.axialTilt = axialTilt;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "PlanetModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", englishName='" + englishName + '\'' +
                ", isPlanet=" + isPlanet +
                ", moons=" + moons +
                ", semimajorAxis=" + semimajorAxis +
                ", perihelion=" + perihelion +
                ", aphelion=" + aphelion +
                ", eccentricity=" + eccentricity +
                ", inclination=" + inclination +
                ", mass=" + mass +
                ", vol=" + vol +
                ", density=" + density +
                ", gravity=" + gravity +
                ", escape=" + escape +
                ", meanRadius=" + meanRadius +
                ", equaRadius=" + equaRadius +
                ", polarRadius=" + polarRadius +
                ", flattening=" + flattening +
                ", dimension='" + dimension + '\'' +
                ", sideralOrbit='" + sideralOrbit + '\'' +
                ", sideralRotation='" + sideralRotation + '\'' +
                ", aroundPlanet='" + aroundPlanet + '\'' +
                ", discoveredBy='" + discoveredBy + '\'' +
                ", discoveryDate='" + discoveryDate + '\'' +
                ", alternativeName='" + alternativeName + '\'' +
                ", axialTilt=" + axialTilt +
                ", rel='" + rel + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(englishName);
        dest.writeByte((byte) (isPlanet == null ? 0 : isPlanet ? 1 : 2));
        dest.writeLong(semimajorAxis);
        dest.writeLong(perihelion);
        dest.writeLong(aphelion);
        dest.writeFloat(eccentricity);
        dest.writeFloat(inclination);
        dest.writeFloat(density);
        dest.writeFloat(gravity);
        dest.writeFloat(escape);
        dest.writeFloat(meanRadius);
        dest.writeFloat(equaRadius);
        dest.writeFloat(polarRadius);
        dest.writeFloat(flattening);
        dest.writeString(dimension);
        dest.writeString(sideralOrbit);
        dest.writeString(sideralRotation);
        dest.writeString(aroundPlanet);
        dest.writeString(discoveredBy);
        dest.writeString(discoveryDate);
        dest.writeString(alternativeName);
        dest.writeFloat(axialTilt);
        dest.writeString(rel);
        dest.writeString(image);
    }
}
