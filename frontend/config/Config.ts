export default interface Config {

    backendURL: string;
    backend(append: string):string;

    noteApiUrl: string;
    noteApi(append: string): string;

    noteBaseUrl: string;
    noteBase(append: string): string;

    devServerPort: number;
}
